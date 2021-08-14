package com.jon.order;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jon.order.controller.OrderController;


import com.jon.order.entity.Order;
import net.minidev.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.containsString;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class) // let order Controller run
@AutoConfigureMockMvc
public class testOrder {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private OrderController orderController;

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
    public void insertTest() throws Exception {
        // the clientId can't be null
        this.mockMvc.perform(post("/order")).andDo(print()).andExpect(status().is(406));

        // insert a record normally
        Order order = Order.builder().startAddress("Bristol").endAddress("Bath").city("Bristol").cargoInfo("a beautiful guitar")
                .cargoType("instrument").date("2022-05-22").time("12:00").telephone("4775874568").sPostcode("BS15TP").ePostcode("BA4ED").build();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonorder = objectMapper.writeValueAsString(order);
        this.mockMvc.perform(post("/order").content(jsonorder).param("clientId","1").contentType(MediaType.APPLICATION_JSON))
                .andDo(print()).andExpect(status().is(201));
    }
    // 正确，错误性，特殊值，临界值
}
