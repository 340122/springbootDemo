package cn.massz.controller;

import cn.massz.domain.User;
import cn.massz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户的控制器
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAllUser(){
        List<User> allUser = userService.findAllUser();
        System.out.println(allUser);
        return allUser;

    }
}
