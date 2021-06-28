package com.jon.api.owner.demo;


import com.jon.api.owner.Entity.User;
import com.jon.api.owner.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired(required = false)
    private UserMapper UserMapper;

    @Test
    public void testQuery() throws Exception {
        User user = UserMapper.findUserByName("root");
        if(user != null){
            System.out.println("succcccc.....");
        }
        assert user != null;
    }



}
