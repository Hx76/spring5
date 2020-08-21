package com.hx76.service;

import com.hx76.dao.UserDao;
import com.hx76.dao.UserDaoImpl;

/**
 * @author hx76
 */
public class UserServiceImpl implements UserService{
    //private UserDao dao = new UserDaoImpl();

    private UserDao dao;
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void getUserName() {
        dao.getUserName();
    }
}
