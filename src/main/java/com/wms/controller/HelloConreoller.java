package com.wms.controller;

import com.wms.entity.User;
import com.wms.service.UserService;
import com.wms.service.impl.UserServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Repository;
import java.util.List;

@RestController
public class HelloConreoller {
@GetMapping

    public String hello(){
        return "Hello World"; // 返回一个字符串



    }
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/users")
    public List<User> list() {
        return userService.list();
    }
}
