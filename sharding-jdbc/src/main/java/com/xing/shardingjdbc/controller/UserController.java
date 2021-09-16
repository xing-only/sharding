package com.xing.shardingjdbc.controller;

import com.xing.shardingjdbc.entity.User;
import com.xing.shardingjdbc.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * @Description: TODO
 * @Author DXX
 * @Date 2021/9/10
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;


    @GetMapping("/save")
    public String insert() {
        User user = new User();
        user.setNickname("zhangsan"+ new Random().nextInt());
        user.setPassword("1234567");
        user.setSex(1);
        user.setBirthday("1988-12-03");
        userMapper.addUser(user);
        return "success";
    }


    @GetMapping("/listuser")
    public List<User> listuser() {
        return userMapper.findUsers();
    }
}
