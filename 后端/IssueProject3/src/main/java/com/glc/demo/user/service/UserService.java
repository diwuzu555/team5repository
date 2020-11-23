package com.glc.demo.user.service;

import com.glc.demo.user.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserEntity> listUser(Map map);

    //注册
    public void register(UserEntity user);

    //查询用户数据
    public UserEntity queryUser(Integer userId);

    //修改用户数据
    public void updateUser(@RequestBody UserEntity user);
    
    //删除用户
    public void deleteUser(Integer userId);
    
    //登录
    public void login(Integer userId);
}
