package com.okit.service.impl;

import com.okit.dao.UserMapper;
import com.okit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:TYZC
 * @Date:2022/1/18
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


}
