package com.okit;

import com.google.gson.Gson;
import com.okit.pojo.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;


@RunWith(SpringRunner.class)
@SpringBootTest
class Ok002ApplicationTests {
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

}
