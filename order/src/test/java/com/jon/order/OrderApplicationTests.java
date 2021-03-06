package com.jon.order;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jon.order.controller.OrderController;


import com.jon.order.entity.Order;
import com.jon.order.entity.Quote;
import com.jon.order.mapper.OrderMapper;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class) // let order Controller run
@AutoConfigureMockMvc
@Transactional
public class OrderApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private OrderController orderController;

    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Test
    public void insertQuote() {
        Quote q = new Quote();
        q.setDriverId("1");
        q.setQuote(10000);
        orderMapper.insertQuoteMistake(q);
    }

    @Test
    public void retrieveAll() throws Exception {
        for (int i = 0; i < 0; i++) {
            this.mockMvc.perform(get("/order/all")).andDo(print()).andExpect(status().isOk());
        }
    }

    @Test
    public void contextLoads() throws Exception {
        assertThat(orderController).isNotNull();
    }



    @Test
    public void getallTest() throws Exception {

        this.mockMvc.perform(get("/order/all")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("bristol")));
        this.mockMvc.perform(get("/order/1")).andDo(print()).andExpect(status().is(200));
        this.mockMvc.perform(get("/order/3")).andDo(print()).andExpect(status().is(200));
        this.mockMvc.perform(get("/order/4")).andDo(print()).andExpect(status().is(200));
    }

    @Test
    @Rollback
    public void concurrencyTest() throws Exception {
        // startTaskAllInOnce(100);
        // 2000 6s
        // 1000 3s
    }

    @Test
    public void limitquery() {
        List<Order> orders = orderMapper.selectLimitOrders(0, 10);
        System.out.println(orders);
    }

    public void startTaskAllInOnce(int threadNums) throws InterruptedException {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(threadNums);
        for(int i = 0; i < threadNums; i++) {
            int finalI = i;
            Thread t = new Thread(() -> {
                try {
                    // ??????????????????????????????????????????????????????????????????
                    startGate.await();
                    try {
                        insertTest(String.valueOf(finalI));
                        //this.mockMvc.perform(get("/order/all")).andDo(print()).andExpect(status().isOk());
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        // ???????????????1?????????0?????????????????????????????????
                        endGate.countDown();
                    }
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            });
            t.start();
            System.out.println(Thread.currentThread().getName() + " start time : " + System.currentTimeMillis());
        }
        startGate.countDown();
        endGate.await();
    }

    // user publish order to market
    public void insertTest(String userId) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Order order = Order.builder().clientId(userId).startAddress("Aristol").endAddress("Bath").city("Bristol").cargoInfo("a beautiful guitar")
                .cargoType("instrument").date("1000-05-22").time("12:00").telephone("4775874568").sPostcode("BS15TP").ePostcode("BA4ED").build();

        String jsonorder = objectMapper.writeValueAsString(order);
        System.out.println(order.toString());
//        // the clientId or Order can't be NULL
//        this.mockMvc.perform(post("/order").content(objectMapper.writeValueAsString(new Order())).param("clientId",userId).contentType(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().is(406));
//        this.mockMvc.perform(post("/order").content(jsonorder).contentType(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().is(406));

        // insert a record normally
        this.mockMvc.perform(post("/order").content(jsonorder).param("clientId",userId).contentType(MediaType.APPLICATION_JSON))
                .andDo(print()).andExpect(status().is(201));

        // check the records
        this.mockMvc.perform(get("/order").param("userType","CLIENT").param("userId",userId))
                .andDo(print()).andExpect(content().string(containsString("1000-05-22")));
    }
}
