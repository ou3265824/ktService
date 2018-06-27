package com.olq.service.service;

import com.olq.service.model.UserBean;

public interface IUserService {

    public UserBean selectUser(long userId);

}