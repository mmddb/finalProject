package com.jon.order.mapper;

import com.jon.order.entity.Order;
import com.jon.order.entity.Quote;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface OrderMapper {

    @Insert("INSERT INTO Orders (clientId,startAddress,endAddress,sPostcode,ePostcode,city,cargoType,cargoInfo,telephone,date,time,status) " +
            "VALUES(#{clientId},#{startAddress}, #{endAddress}, #{sPostcode},#{ePostcode},#{city},#{cargoType},#{cargoInfo},#{telephone},#{date},#{time},#{status})")
    void insertOrder(Order order);

    @Select("SELECT * FROM Orders WHERE status = 'PUBLISHED'")
    List<Order> selectAllOrder();

    @Select("SELECT * FROM Orders WHERE orderId = #{orderId}")
    Order selectOrderById(String orderId);

    @Update({"UPDATE Orders SET status = #{status} WHERE orderId = #{orderId}"})
    void updateOrder(String orderId, String status);

    @Update({"UPDATE Orders SET status = 'FETCHED', driverId = #{userId} WHERE orderId = #{orderId}"})
    void setDriver(String userId, String orderId);

    @Update({"UPDATE Orders SET price = #{price} WHERE orderId = #{orderId}"})
    void updatePrice(String orderId, String price);

    @Insert({"INSERT INTO Quotes (orderId, driverId, quote) VALUES(#{orderId},#{driverId},#{quote}) "})
    void insertQuote(Quote q);

    @Insert({"INSERT INTO Quotes (driverId, quote) VALUES(#{driverId},#{quote}) "})
    void insertQuoteMistake(Quote q);

    @Select("SELECT * FROM Quotes WHERE orderId = #{orderId}")
    List<Quote> selectByOrderId(String orderId);

    @Select("SELECT * FROM Orders WHERE clientId = #{clientId}")
    List<Order> selectByClientId(String clientId);

    @Select("SELECT * FROM Orders WHERE driverId = #{clientId}")
    List<Order> selectByDriverId(String driverId);

    @Delete("DELETE FROM Orders WHERE orderId = #{orderId}")
    void deleteOrder(String orderId);



}
