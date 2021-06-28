package com.jon.api.owner;


import com.jon.api.owner.Entity.LoginInfo;
import com.jon.api.owner.Entity.LoginResult;
import com.jon.api.owner.Entity.User;
import com.jon.api.owner.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(path="/login",
//        produces = "application/json")
@CrossOrigin(originPatterns = "*")
public class LoginController {

    @Autowired(required = false)
    private UserMapper userMapper;

    @GetMapping("/login")
    public LoginResult test(){
        User user = userMapper.findUserByName("root");
        if(user != null){
            return new LoginResult(200,"登录成功",user);
        }
        return new LoginResult(500,"登录失败", null);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResult login( @RequestBody LoginInfo loginInfo){

        System.out.println("进来了");

        String email = loginInfo.getEmail();
        String pwd = loginInfo.getPassword();

        User user = userMapper.findUserByEmail(email);

        if(user != null && user.getPassword().equals(pwd)){
            return new LoginResult(200,"登录成功",user);
        }
        System.out.println("进来的密码 ：" + pwd);
        System.out.println("查到的密码：" + user.getPassword());
        return new LoginResult(500,"登录失败", null);
    }

}
