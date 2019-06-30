package com.hwrky.shop.dao;

import com.hwrky.shop.entity.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {
    Integer insertOne(@Param("user") User user);
    Integer selectTotal(@Param("user") User user);
    
    public User getByLogin(@Param("user") User user);
}
