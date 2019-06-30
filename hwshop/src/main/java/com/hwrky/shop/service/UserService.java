package com.hwrky.shop.service;

import com.hwrky.shop.entity.User;


public interface UserService {
    boolean add(User user);
    Integer getTotal(User user);
    
    public User getByLogin(User user);
}
