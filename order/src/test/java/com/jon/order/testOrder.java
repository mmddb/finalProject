package com.jon.order;

import com.jon.order.entity.Order;
import com.jon.order.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class testOrder {

    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Test
    public void insertOrder(){

        Order testOrder = Order.builder().cargoInfo("lallall").cargoType("furniture").city("bristol")
                .date("2021/07/07").clientId("1111").endAddress("london").ePostcode("B3")
                .startAddress("bristol").sPostcode("BS15TP").time("8:00").build();
        orderMapper.insertOrder(testOrder);

        System.out.println(orderMapper.selectByClientId("1111"));
    }

    @Test
    public void fetch(){
        List<Order> orders = orderMapper.selectByClientId("1111");
        System.out.println(orders);
        orderMapper.updateOrder("001","1","FETCHED");
    }
}
