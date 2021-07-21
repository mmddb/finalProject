package com.jon.api.client.mapper;
import com.jon.api.client.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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

    @Insert("INSERT INTO Users (name,password,telephone,email) VALUES(#{name}, #{password}, #{telephone},#{email})")
    void insertUser(User user);
}
