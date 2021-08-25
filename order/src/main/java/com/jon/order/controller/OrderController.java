package com.jon.order.controller;

import com.jon.order.entity.Order;
import com.jon.order.entity.OrderStatus;
import com.jon.order.entity.Quote;
import com.jon.order.feignClients.EmailFeignClient;
import com.jon.order.mapper.OrderMapper;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@RestController
@CrossOrigin(originPatterns = "*")
@Api(value = "Apis of Order Service")
public class OrderController {

    @Autowired(required = false)
    OrderMapper orderMapper;

    @Autowired
    private EmailFeignClient emailFeignClient;

    @PostMapping("/order")
    @ApiOperation(value = "Publish new order to the platform")
    public ResponseEntity publishOrder(@RequestBody Order order, String clientId){
        if(clientId == null || order == null){
            return new ResponseEntity(null, HttpStatus.NOT_ACCEPTABLE);
        }
        order.setClientId(clientId);
        System.out.println(order);
        try {
            orderMapper.insertOrder(order);
            //emailFeignClient.statusEmail("PUBLISHED",clientId,);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(null, HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity(order, HttpStatus.CREATED);
    }

    @DeleteMapping("/order")
    @ApiOperation("delete order")
    public ResponseEntity deleteOrder(String user, String type, String orderId) {
        orderMapper.deleteOrder(orderId);
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/accept")
    @ApiOperation("client accept the order")
    public ResponseEntity acceptOrder(String driverId, String orderId) {
        try {
            orderMapper.setDriver(driverId, orderId);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity("successfully accepted, then you can pay the driver", HttpStatus.OK);
    }


    @PutMapping("/order")
    @ApiOperation(value = "Update order status, used to fetch order, confirm transport, payment ")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Updated successfully", response = ResponseEntity.class),
            @ApiResponse(code = 406, message = "Order status not acceptable", response = ResponseEntity.class),
            @ApiResponse(code = 424, message = "Email service current is not available", response = ResponseEntity.class)})
    public ResponseEntity updateOrder(String userId, String type, String orderId, OrderStatus status) {
        System.out.println(" ===== " + userId + type + orderId + status.toString());
        Order order = orderMapper.selectOrderById(orderId);
        System.out.println(order);
        OrderStatus curStat = order.getStatus();
//        if(status.compareTo(curStat) <= 0){
//            System.out.println(status.compareTo(curStat));
//            return new ResponseEntity(null, HttpStatus.NOT_ACCEPTABLE);
//        }
        System.out.println(status);
        try {
            if(status.equals(OrderStatus.FETCHED)){
                orderMapper.setDriver(userId, orderId);
            }
            orderMapper.updateOrder(orderId, status.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        String clientId = orderMapper.selectOrderById(orderId).getClientId();
        try{
            emailFeignClient.statusEmail(status.toString(), clientId ,orderId);
        }catch (Exception e){
            return new ResponseEntity("Email service is dead", HttpStatus.FAILED_DEPENDENCY);
        }

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
    public ResponseEntity setQuote(String orderId, String driverId, Integer quote){
        System.out.println(orderId + driverId + quote);
        Quote q = new Quote();
        q.setOrderId(orderId);
        q.setDriverId(driverId);
        q.setQuote(quote);
        orderMapper.insertQuote(q);
        System.out.println(q);
        // give client a notification
        Order order = orderMapper.selectOrderById(orderId);

        emailFeignClient.quoteEmail(order.getClientId(), String.valueOf(quote), driverId, orderId);

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
        return new ResponseEntity(qs, HttpStatus.OK);
    }

    @PostMapping(value = "/photo")
    public ResponseEntity<String> uploadImage(
            @RequestBody MultipartFile photo,
            String orderId)
            throws IOException {
       System.out.println("--got request to update Lot Image--");
       try {
            byte[] bytes = photo.getBytes();
            // 写到本地


       } catch (IOException e) {
            e.printStackTrace();
       }

       System.out.println("--Image updated--");
       return new ResponseEntity<String>("Success", HttpStatus.OK);
    }



}
