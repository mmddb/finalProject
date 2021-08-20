package com.jon.api.user;



import com.jon.user.Entity.User;
import com.jon.user.mapper.UserMapper;
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

    @Test
    public void testRegister() throws Exception {
        User user = new User();
        user.setEmail("jon_1999@foxmail.com");
        user.setName("jon");
        user.setPassword("jon");
        user.setType("CLIENT");
        UserMapper.insertUser(user);
    }



}
