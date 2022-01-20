package com.okit;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author:TYZC
 * @Date:2022/1/20
 * @Description:
 */
public class AnotherTest {
    ReentrantLock lock=new ReentrantLock();
    @Test
    public void test01(){
        for (int i = 0; i < 100; i++) {
            Person p=new Person();
            p=null;
            System.gc();
            System.out.println("---------");
        }
    }

}
class Person{
    static Integer i=1;
    //普通注释
    //TODO  非一般
    //toDo  不区分大小写

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collection Start!"+i++);
    }
}
