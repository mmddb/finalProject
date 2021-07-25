package com.jon.order.controller;

import com.jon.order.entity.Order;
import com.jon.order.entity.Quote;
import com.jon.order.mapper.OrderMapper;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(originPatterns = "*")
@Api(value = "Apis of Order Service")
public class OrderController {

    @Autowired(required = false)
    OrderMapper orderMapper;


    RestTemplate rest = new RestTemplate();

    @PostMapping("/order")
    @ApiOperation(value = "Publish new order to the platform")
    public ResponseEntity publishOrder(@RequestBody Order order){
        System.out.println(order);
        try {
            orderMapper.insertOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity(order, HttpStatus.CREATED);
    }

    @PutMapping("/order")
    @ApiOperation(value = "Update order status, used to fetch order, confirm transport, payment or cancel order")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Updated successfully", response = ResponseEntity.class),
            @ApiResponse(code = 406, message = "Order status not acceptable", response = ResponseEntity.class)})
    public ResponseEntity fetchOrder(String driverId, String orderId, String status){
        if(!(status.equals("FETCHED") || status.equals("TRANSPORTED") || status.equals("PAID") || status.equals("COMPLETED"))){
            return new ResponseEntity(null, HttpStatus.NOT_ACCEPTABLE);
        }
        try {
            orderMapper.updateOrder(driverId, orderId, status);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // send confirmation email to client and driver

        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/order")
    @ApiOperation(value = "Get orders of specific user", notes = "userType = 'CLIENT' || 'DRIVER'")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Query successfully", response = ResponseEntity.class),
            @ApiResponse(code = 406, message = "User type not acceptable", response = ResponseEntity.class),
            @ApiResponse(code = 204, message = "No Content", response = ResponseEntity.class)
    })
    public ResponseEntity getOrders(String userType, String userId){
        List<Order> orders;
        if("CLIENT".equals(userType)) {
            orders = orderMapper.selectByClientId(userId);
        }else if("DRIVER".equals(userType)){
            orders = orderMapper.selectByDriverId(userId);
        }else{
            return new ResponseEntity(null, HttpStatus.NOT_ACCEPTABLE);
        }
        if(orders.size() == 0){
            return new ResponseEntity(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(orders, HttpStatus.OK);
    }

    @GetMapping("/order/{id}")
    @ApiOperation(value = "Get an order based on orderId")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Query successfully", response = ResponseEntity.class),
    })
    public ResponseEntity getAnOrder(@PathVariable("id") String orderId){
        Order order = orderMapper.selectOrderById(orderId);
        return new ResponseEntity(order, HttpStatus.OK);
    }

    
    @GetMapping("/order/all")
    @ApiOperation(value = "Get all orders that not be fetched")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Query successfully", response = ResponseEntity.class),
            @ApiResponse(code = 204, message = "No Content", response = ResponseEntity.class)
    })
    public ResponseEntity checkOrders(){
        List<Order> orders = new ArrayList<>();
        try {
            orders = orderMapper.selectAllOrder();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(orders.size() == 0){
            return new ResponseEntity(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(orders, HttpStatus.OK);
    }


    @PostMapping("/quote")
    @ApiOperation(value = "Drivers give a quote to an order")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Created successfully", response = ResponseEntity.class),
            @ApiResponse(code = 204, message = "No Content", response = ResponseEntity.class)
    })
    public ResponseEntity setQuote(String orderId, String driverId, int quote){

        Quote q = new Quote();

        q.setOrderId(orderId);
        q.setDriverId(driverId);
        q.setQuote(quote);

        orderMapper.insertQuote(q);
        System.out.println(q);
        // give client a notification
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    @GetMapping("/quote")
    @ApiOperation(value = "Get all quotes for an order")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Get Successfully", response = ResponseEntity.class),
            @ApiResponse(code = 204, message = "No Content", response = ResponseEntity.class)
    })
    public ResponseEntity price(String orderId){
        List<Quote> qs = orderMapper.selectByOrderId(orderId);
        if(qs.size() == 0){
            return new ResponseEntity(null, HttpStatus.NO_CONTENT);
        }
        // give client a notification
        return new ResponseEntity(qs, HttpStatus.OK);
    }



}
