package com.okit.pojo;

/**
 * @Author:TYZC
 * @Date:2022/1/19
 * @Description:
 */
public class Person {
    String name;
    Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
