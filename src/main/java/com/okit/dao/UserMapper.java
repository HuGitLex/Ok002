package com.okit.dao;

import com.okit.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getInfo(String name,String password);

}
