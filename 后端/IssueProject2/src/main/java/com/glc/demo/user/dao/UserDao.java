package com.glc.demo.user.dao;

import com.glc.demo.user.entity.IssueEntity;
import com.glc.demo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

//    List<UserEntity> getAll(@Param("content") Map map);
//
//    void delByUserId(Integer userId);
//
//    //保存用户
//    public void save(UserEntity userEntity);
//
//
//    //根据id查询用户数据
//    public UserEntity getUserByUserId(Integer userId);
//
//    public void updateUserByUserId(UserEntity userEntity);

////////////////////////////////

    //获取用户信息
    public UserEntity queryUser(Integer userId);
 
    //查询所有用户信息
    public List<UserEntity> listUser();
 

    //注册
    public int register(UserEntity user);

    
    //修改用户信息
    public int updateUser(UserEntity user);
 

	//删除用户
    public int deleteUser(Integer userId);
    
    //登录
    public int login(Integer userId);

    //根据userId查询用户的Issue信息
    public UserEntity selectIssueByUserId(Integer userId);
 
//    /**
//     * 根据userId查询用户选择的运营商
//     */
//    public UserEntity selectComboById(Integer id);
}
