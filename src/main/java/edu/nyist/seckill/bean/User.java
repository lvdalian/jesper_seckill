package edu.nyist.seckill.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author rogers
 * @version 1.0
 */
@Data
public class User {
    /**
     * 用户id
     */
    private Long id;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * MD5(MD5(pass明文+固定salt)+salt
     */
    private String password;
    /**
     * 混淆盐
     */
    private String salt;
    /**
     * 头像，云存储的ID
     */
    private String head;
    /**
     * 注册时间
     */
    private Date registerDate;
    /**
     * 上次登录时间
     */
    private Date lastLoginDate;
    /**
     * 登录次数
     */
    private Integer loginCount;
}
