package com.jon.api.client;

import com.jon.api.client.Entity.LoginInfo;
import com.jon.api.client.Entity.LoginResult;
import com.jon.api.client.Entity.User;
import com.jon.api.client.mapper.UserMapper;
import com.jon.api.client.util.JwtUtil;
import io.jsonwebtoken.Jwt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
//@RequestMapping(path="/login",
//        produces = "application/json")
@CrossOrigin(originPatterns = "*")
public class LoginController {

    @Autowired(required = false)
    private UserMapper userMapper;

    @GetMapping("/checkToken")
    public Boolean checkToken(HttpServletRequest request){
        String token = request.getHeader("token");
        return JwtUtil.parse(token);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Boolean register(@RequestBody User user){
        userMapper.insertUser(user);
        if(userMapper.findUserByEmail(user.getEmail()) != null){
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResult login( @RequestBody LoginInfo loginInfo){

        System.out.println("进来了");

        String email = loginInfo.getEmail();
        String pwd = loginInfo.getPassword();
        System.out.println(email + " " + pwd);

        User user = userMapper.findUserByEmail(email);

        if(user != null && user.getPassword().equals(pwd)){
            String token = JwtUtil.jwt(user.getName(),"administer");
            System.out.println(token);

            return new LoginResult(200,"登录成功",token,user);
        }
        if(user == null){
            System.out.println("user is null");
        }else{
            System.out.println("查到的密码：" + user.getPassword());
        }

        System.out.println("进来的密码 ：" + pwd);
        return new LoginResult(500,"登录失败",null, null);
    }

}
