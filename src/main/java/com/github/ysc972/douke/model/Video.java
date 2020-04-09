package com.github.ysc972.douke.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/15 5:42 下午
 * @changeRecord
 */
@Data
@Entity
@Table(name = "dk_video")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dk_id")
    //主键
    private long id;
    //业务id
    @Column(name = "dk_bdk_id")
    private long bdkId;

    @Column(name = "dk_like_count")
    private long likeCount;

    @Column(name = "dk_comment_count")
    private long comment_count;

    @Column(name = "dk_desc")
    private String desc;

    @Column(name = "dk_url")
    private String url;
}
