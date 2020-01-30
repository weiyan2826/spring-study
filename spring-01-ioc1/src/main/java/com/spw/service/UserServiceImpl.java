package com.spw.service;

import com.spw.dao.UserDao;
import com.spw.dao.UserDaoImpl;

/**
 * @author spw
 * @create 2020-01-30 10:34
 */
public class UserServiceImpl implements UserService {

    UserDao userDao=new UserDaoImpl();

    public void getUser() {
        userDao.getUser();
    }
}
