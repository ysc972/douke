package com.github.ysc972.douke.service.impl;

import com.github.ysc972.douke.service.LikeRedisService;
import com.github.ysc972.douke.service.thirdparty.CacheOperation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/16 11:09 上午
 * @changeRecord
 */
@Service
public class LikeRedisServiceImpl implements LikeRedisService {

    @Resource
    CacheOperation cacheOperation;

    @Override
    public boolean likedRedis(String userId, String videoId) {
       try{
           cacheOperation.put(userId,videoId,1);
           likedCountIncr(videoId);
       }catch (Exception e){
           return false;
       }
        return true;
    }

    @Override
    public boolean unLikedRedis(String userId, String videoId) {

        try {
            cacheOperation.delete(userId,videoId);
            likedCountDecr(videoId);
        }catch (Exception e){
            return false;
        }

        return true;
    }

    @Override
    public boolean userIfLiked(String userId, String videoId) {
        Object ifliked = cacheOperation.get(userId, videoId);
        if(ifliked==null){
            return false;
        }
        return true;
    }

    @Override
    public void saveLikeCount(String videoId, int count) {
        cacheOperation.set(videoId,count);
    }

    @Override
    public long likedCountIncr(String videoId) {
        return cacheOperation.increment(videoId);
    }

    @Override
    public long likedCountDecr(String videoId) {
        return cacheOperation.decrement(videoId);
    }


}
