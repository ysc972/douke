package com.github.ysc972.douke.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/14 2:15 下午
 * @changeRecord
 */


@Entity
@Table(name = "dk_user_info")
public class DkUserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dk_id")
    // 主键
    private long id;
    //业务id
    @Column(name = "dk_bdk_id")
    private int bdkId;

    //用户性别
    @Column(name = "dk_sex")
    private String sex="";
    //用户描述
    @Column(name = "dk_desc")
    private String desc="";
    //用户头像地址
    @Column(name = "dk_avatar_url")
    private String avatarUrl="";

    @Column(name = "dk_creat_Time")
    private LocalDateTime createTime=LocalDateTime.now();
    @Column(name = "dk_modify_time")
    private LocalDateTime modifyTime=LocalDateTime.now();
    @Column(name = "dk_version")
    private int version;
    @Column(name = "dk_deleted")
    private int deleted;
}
