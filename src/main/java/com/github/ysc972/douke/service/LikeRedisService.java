package com.github.ysc972.douke.service;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/16 11:01 上午
 * @changeRecord
 */
public interface LikeRedisService {
    /**
     * 点赞
     * @param userId 用户Id
     * @param videoId 视频Id
     */
    boolean likedRedis(String userId,String videoId);

    /**
     * 取消点赞
     * @param userId 用户id
     * @param videoId 视频id
     */
    boolean unLikedRedis(String userId,String videoId);


    /**
     * 用户是否对视频点赞
     * @param userId
     * @param videoId
     * @return
     */
    boolean userIfLiked(String userId,String videoId);

    /**
     * 保存视频的点赞数
     * @param videoId 视频id
     * @param count 点赞数
     */
    void saveLikeCount(String videoId,int count);

    /**
     * 视频点赞数+1
     * @param videoId 视频id
     * @return 视频的点赞数
     */
    long likedCountIncr(String videoId);

    /**
     * 视频点赞数-1
     * @param videoId 视频id
     * @return 视频点赞数
     */
    long likedCountDecr(String videoId);

}
