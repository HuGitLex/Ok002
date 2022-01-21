package com.okit;

import com.google.gson.Gson;
import com.okit.dao.UserMapper;
import com.okit.pojo.Person;
import com.okit.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;


@RunWith(SpringRunner.class)
@SpringBootTest
class Ok002ApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    public void demo1(){
        Jedis jedis=new Jedis("127.0.0.1", 6379);
        jedis.auth("123456");
        jedis.set("007","jizige");
        for (int i = 1; i <= 7; i++) {
            System.out.println(jedis.get("00" + i));
        }
        jedis.close();
    }

    @Test
    public void testGson(){
        Gson gson=new Gson();
        Person person = gson.fromJson("{'name':'zhansan','age':1}", Person.class);
        System.out.println(person);

    }

    @Test
    public void addUser(){
        System.out.println(userMapper.insertUser(new User("zhansgan", 12)));
        System.out.println(userMapper.insertUser(new User("wangwu", 8)));
        System.out.println(userMapper.insertUser(new User("zhangjiu", 82)));
        System.out.println(userMapper.insertUser(new User("zhangyong", 26)));

    }
    @Test
    public void search(){
        System.out.println(userMapper.searchById(1));
        System.out.println(userMapper.searchById(2));
        System.out.println(userMapper.searchById(3));
        System.out.println(userMapper.searchById(4));
        System.out.println(userMapper.searchById(5));

    }
    @Test
    public void update(){
        System.out.println(userMapper.updateUser(new User("zhangsan", 110)));
        System.out.println(userMapper.updateUser(new User("zhansgan", 100)));
    }


}
