package com.olq.service.service.impl;


import com.olq.service.dao.IUserDao;
import com.olq.service.model.UserBean;
import com.olq.service.service.IUserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class IUserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public UserBean selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}


