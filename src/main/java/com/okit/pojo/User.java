package com.okit.pojo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author:TYZC
 * @Date:2022/1/18
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    Integer id;
    String name;
    Integer age;
    public User(String name,Integer age){
        this.name=name;
        this.age=age;
    }
}
