package com.jon.api.user.mapper;
import com.jon.api.user.Entity.Payment;
import com.jon.api.user.Entity.Review;
import com.jon.api.user.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM Users WHERE name = #{name} ")
    // 对应作用，当 类字段 和 数据库表字段不一致时
    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "password", column = "password")
    })
    User findUserByName(String name);

    @Select("SELECT * FROM Users WHERE email = #{email} ")
    User findUserByEmail(String email);

    @Select("SELECT * FROM Payment WHERE userId = #{userId} ")
    Payment getPaymentById(String userId);

    @Insert("INSERT INTO Payment (userId,recipient,sortcode,accountnumber) VALUES(#{userId}, #{recipient}, #{sortcode},#{accountnumber})")
    void insertPayment(Payment payment);

    @Insert("INSERT INTO Users (name,password,telephone,email,type) VALUES(#{name}, #{password}, #{telephone},#{email},#{type})")
    void insertUser(User user);

    @Insert("INSERT INTO Review (clientId,driverId,star,comment,orderId) VALUES(#{clientId}, #{driverId}, #{star},#{comment},#{orderId})")
    void insertReview(Review review);

    @Select("SELECT * FROM Review WHERE driverId = #{driverId} ")
    List<Review> getReviewsById(String driverId);

    @Select("SELECT email FROM Users WHERE id = #{userId} ")
    String getEmailById(String userId);
}
