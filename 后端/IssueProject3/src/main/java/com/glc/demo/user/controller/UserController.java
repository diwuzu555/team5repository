package com.glc.demo.user.controller;


import com.glc.demo.user.entity.UserEntity;
import com.glc.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * RestController=@ResponseBody+@Controller
 *
 */

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    //获取所有用户
    @ResponseBody
    @RequestMapping("/listUser")
    public List<UserEntity> listUser(Map map){
        return userService.listUser(map);
    }

    //删除用户
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer userId){
        userService.deleteUser(userId);
        return "success";
//        return "redirect:/index.html";//重定向功能
    }
    
    //注册
    @RequestMapping("/register")
    @ResponseBody
    public String register(@RequestBody UserEntity user){
        System.out.println("用户注册"+user.toString());
        userService.register(user);
        return "success";
    }
    
    //查询用户信息
    @RequestMapping("/queryUser")
    @ResponseBody
    public UserEntity queryUser(Integer userId){
          return  userService.queryUser(userId);
    }
    
    //修改用户信息
    @RequestMapping("/updateUser")
    @ResponseBody
    public String updateUser(@RequestBody UserEntity user){
       userService.updateUser(user);
        return "success";
    }
    
    //登录
    @RequestMapping("/login")
    @ResponseBody
    public String login(Integer userId){
       userService.login(userId);
        return "success";
    }

}
