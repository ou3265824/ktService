package com.olq.service.dao;

import com.olq.service.model.UserBean;

public interface IUserDao {

    UserBean selectUser(long id);

}