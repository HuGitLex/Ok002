package com.okit.service.impl;

import com.okit.dao.UserMapper;
import com.okit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 * @Author:TYZC
 * @Date:2022/1/18
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(propagation= Propagation.REQUIRED)
    public void doIt() {
        userMapper.getInfo("111","212");
    }
}
