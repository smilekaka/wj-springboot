package com.frontbackend.learning.dao;

/**
 * @program: wj-springboot
 * @description: 用户数据访问层接口
 * @author: Jin Chun Liang
 * @create: 2020-07-10 17:18
 **/

import com.frontbackend.learning.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}

