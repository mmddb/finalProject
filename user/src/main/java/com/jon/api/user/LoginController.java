package com.jon.api.user;

import com.jon.api.user.Entity.*;
import com.jon.api.user.mapper.UserMapper;
import com.jon.api.user.util.JwtUtil;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Api(tags = "APIs of User Service")
@CrossOrigin(originPatterns = "*")
public class LoginController {

    @Autowired(required = false)
    private UserMapper userMapper;

    @ApiIgnore
    @GetMapping("/checkToken")
    public Boolean checkToken(HttpServletRequest request){
        String token = request.getHeader("token");
        return JwtUtil.tokenValid(token);
    }

    @ApiIgnore
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Boolean register(@RequestBody User user){
        userMapper.insertUser(user);
        if(userMapper.findUserByEmail(user.getEmail()) != null){
            return true;
        }
        return false;
    }

    @ApiOperation(value = "New user to register")
    @PostMapping("/user")
    @ApiResponses( value = {@ApiResponse(code=226, message = "IM_USED",response = ResponseEntity.class),
            @ApiResponse(code=201, message="CREATED"),@ApiResponse(code=417, message="EXPECTATION_FAILED")})
    public ResponseEntity newUser(@RequestBody User user) {
        // if people have same email address
        if (userMapper.findUserByEmail(user.getEmail()) != null) {
            return new ResponseEntity(null, HttpStatus.IM_USED);
        }
        userMapper.insertUser(user);
        User newUser;
        // register success
        if ((newUser = userMapper.findUserByEmail(user.getEmail())) != null) {
            return new ResponseEntity(newUser, HttpStatus.CREATED);
        }
        // server error
        return new ResponseEntity(null, HttpStatus.EXPECTATION_FAILED);
    }

    @GetMapping("/token")
    @ApiOperation(value = "Get a token to use in some future's request")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Authentication successfully", response = ResponseEntity.class),
    @ApiResponse(code = 201, message = "Can't find the user", response = ResponseEntity.class)})
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "email", value = "user's email", paramType = "query", required = true),
                                @ApiImplicitParam(name = "password", value = "user's password", paramType = "query", required = true)})
    public ResponseEntity token(String email, String password){
        User user = userMapper.findUserByEmail(email);
        if(user != null && user.getPassword().equals(password)){
            String token = JwtUtil.jwt(user.getId(),user.getType());
            System.out.println(token);
            return new ResponseEntity(token, HttpStatus.OK);
        }
        return new ResponseEntity(null, HttpStatus.NO_CONTENT);
    }

    @GetMapping("/user")
    @ApiOperation(value = "Used to login, return an user object")
    public ResponseEntity user(String email, String password){

        User user = userMapper.findUserByEmail(email);
        if(user != null && user.getPassword().equals(password)){
            String token = JwtUtil.jwt(user.getName(),"administer");
            System.out.println(token);
            return new ResponseEntity(user, HttpStatus.OK);
        }
        return new ResponseEntity(new User(), HttpStatus.NOT_FOUND);
    }

    @ApiIgnore
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

    @GetMapping("/review")
    @ApiOperation(value = "Get reviews of Drivers")
    @ApiImplicitParam(name = "token", paramType = "header", required = true)
    public ResponseEntity getReview(String userId, String token){
        System.out.println(userId);
        System.out.println(token);

        if(!JwtUtil.tokenValid(token)){
            return new ResponseEntity(null, HttpStatus.UNAUTHORIZED);
        }
        List<Review> reviews = userMapper.getReviewsById(userId);
        if(reviews.size() == 0){
            return new ResponseEntity(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(reviews, HttpStatus.OK);
    }

    @PostMapping("/review")
    @ApiOperation(value = "Leave review to driver on specific order")
    @ApiImplicitParam(name = "token", paramType = "header", required = true)
    public ResponseEntity publishReview(@RequestBody Review review, String token){
        System.out.println(review);
        if(!JwtUtil.tokenValid(token)){
            return new ResponseEntity(null, HttpStatus.UNAUTHORIZED);
        }
        try{
            userMapper.insertReview(review);
        }catch (Exception e){
            // 不符合外键约束不报错 ？？
        }finally {

        }
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    @GetMapping("/payment")
    @ApiOperation(value = "Get payment information of drivers")
    @ApiImplicitParam(name = "token", paramType = "header", required = true)
    public ResponseEntity payment(String token, String userId){
        Payment payment = userMapper.getPaymentById(userId);
        if(payment != null){
            return new ResponseEntity(payment, HttpStatus.OK);
        }else{
            return new ResponseEntity(null, HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping("/payment")
    @ApiOperation(value = "upload the payment information", notes = "Only can upload the user himself payment information")
    @ApiImplicitParam(name = "token", paramType = "header", required = true)
    public ResponseEntity createPayment(String token, @RequestBody Payment payment){
        // if is the same person
        System.out.println("id in token: " + JwtUtil.getId(token));
        if(!JwtUtil.getId(token).equals(payment.getUserId())){
            return new ResponseEntity(null, HttpStatus.UNAUTHORIZED);
        }
        System.out.println(payment);
        try {
            userMapper.insertPayment(payment);
        }catch (Exception MysqlDataTruncation){
            // not satisfied the lenghth requirement
            return new ResponseEntity(null, HttpStatus.LENGTH_REQUIRED);
        }
        return new ResponseEntity(null, HttpStatus.CREATED);
    }




}
