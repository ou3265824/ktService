package com.olq.service.service.impl;


import com.olq.service.dao.IUserD;
import com.olq.service.model.User;
import com.olq.service.service.IUserS;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class IUserServiceI implements IUserS {

    @Resource
    private IUserD userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}


