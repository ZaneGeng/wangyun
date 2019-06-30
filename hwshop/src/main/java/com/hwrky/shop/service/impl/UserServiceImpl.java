package com.hwrky.shop.service.impl;

import com.hwrky.shop.dao.UserMapper;
import com.hwrky.shop.entity.User;
import com.hwrky.shop.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{
    private UserMapper userMapper;
    @Resource(name = "userMapper")
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean add(User user) {
        return userMapper.insertOne(user)>0;
    }

	@Override
	public Integer getTotal(User user) {
		return userMapper.selectTotal(user);
	}

	@Override
	public User getByLogin(User user) {
		return userMapper.getByLogin(user);
	}

}
