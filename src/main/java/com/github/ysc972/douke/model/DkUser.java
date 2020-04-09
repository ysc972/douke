package com.github.ysc972.douke.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/14 11:20 上午
 * @changeRecord
 */
@Data
@Entity
@Table(name = "dk_user")
/**
 *  用户表
 */
public class DkUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dk_id")
    //主键
    private long id;
    //业务id
    @Column(name = "dk_bdk_id")
    private long bdkId;
    //手机号
    @Column(name = "dk_phone")
    private String phone="";
    //用户名
    @Column(name = "dk_user_name")
    private String userName="";
    //用户密码
    @Column(name = "dk_password")
    private String password="";

    @Column(name = "dk_creat_Time")
    private LocalDateTime createTime=LocalDateTime.now();
    @Column(name = "dk_modify_time")
    private LocalDateTime modifyTime=LocalDateTime.now();
    @Column(name = "dk_version")
    private int version;
    @Column(name = "dk_deleted")
    private int deleted;




}
