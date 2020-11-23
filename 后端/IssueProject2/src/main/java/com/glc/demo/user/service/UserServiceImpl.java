package com.glc.demo.user.service;


import com.glc.demo.user.dao.UserDao;
import com.glc.demo.user.entity.IssueEntity;
import com.glc.demo.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    
    @Override
    public List<UserEntity> listUser(Map map) {
        return userDao.listUser();
    }

    //删除用户
    @Override
    public void deleteUser(Integer userId) {
        userDao.deleteUser(userId);
    }

    //注册
    @Override
    public void register(UserEntity user) {

        user.setuCreateTime(new Date());
        user.setStatus("激活");
        user.setIdentity("普通职员");
        userDao.register(user);
    }

    //查询用户数据
    @Override
    public UserEntity queryUser(Integer userId) {
        return userDao.queryUser(userId);
    }

    //更新用户数据
    @Override
    public void updateUser(UserEntity user) {
        userDao.updateUser(user);
    }
    
    //登录
    @Override
    public void login(Integer userId) {
        userDao.login(userId);
    }

}
