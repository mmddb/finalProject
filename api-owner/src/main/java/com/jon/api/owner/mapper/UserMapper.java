package com.jon.api.owner.mapper;


import com.jon.api.owner.Entity.User;
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
}
