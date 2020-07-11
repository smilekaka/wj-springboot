package com.frontbackend.learning.service;

/**
 * @program: wj-springboot
 * @description: 用户服务层实现类
 * @author: Jin Chun Liang
 * @create: 2020-07-10 17:19
 **/

import com.frontbackend.learning.dao.UserDao;
import com.frontbackend.learning.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username) {
        return userDao.findByUsername(username);
    }

    public User get(String username, String password){
        return userDao.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDao.save(user);
    }
}

