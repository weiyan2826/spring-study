package com.spw.service;

import com.spw.dao.UserDao;
import com.spw.dao.UserDaoImpl;
import com.spw.dao.UserDaoMysqlImpl;

/**
 * @author spw
 * @create 2020-01-30 10:34
 */
public class UserServiceImpl implements UserService {

    /*UserDao userDao1=new UserDaoMysqlImpl();*/

    //利用set实现动态值的注入
    UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
