package com.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.User;
import com.wms.mapper.UserMapper;
import org.springframework.stereotype.Service;
import  com.wms.service.UserService;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> {

}
