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
 * @created 2020/1/15 5:48 下午
 * @changeRecord
 */
@Data
@Entity
@Table(name = "dk_video_liked")
public class VideoLiked {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dk_id")
    // 主键
    private long id;
    //用户id
    @Column(name = "dk_user_id")
    private long dkUserId;
    //video ID
    @Column(name = "dk_video_id")
    private long videoId;
    @Column(name = "dk_if_like")
    private boolean ifLike;

    @Column(name = "dk_creat_Time")
    private LocalDateTime createTime=LocalDateTime.now();
    @Column(name = "dk_modify_time")
    private LocalDateTime modifyTime=LocalDateTime.now();
    @Column(name = "dk_version")
    private int version;
    @Column(name = "dk_deleted")
    private int deleted;
}
