package com.bw.fyj.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 钰杰
 * @className User
 * @description VX:FengYJ996
 * @date 2019/10/2914:02
 */
@Data
@Entity
@Table(name = "test4_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    private String username;

    private String password;

    private String tel;
    
    public String run(){
        System.out.println("跑");
    }
}
