package com.github.ysc972.douke.service.thirdparty.impl;

import com.github.ysc972.douke.service.thirdparty.CacheOperation;
import org.apache.shiro.crypto.hash.Hash;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/16 10:13 上午
 * @changeRecord
 */
@Service
public class CacheOperationImpl implements CacheOperation {

    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private ValueOperations valueOperations;
    @Resource
    private HashOperations hashOperations;



    @Override
    public void set(Object key, Object value) {
        valueOperations.set(key,value);
    }

    @Override
    public long increment(Object key) {
        return valueOperations.increment(key);
    }

    @Override
    public long decrement(Object key) {
        return valueOperations.decrement(key);
    }

    @Override
    public void set(Object key, Object value, long timeout) {
        valueOperations.set(key,value,timeout, TimeUnit.SECONDS);
    }

    @Override
    public Object get(Object key) {
        return valueOperations.get(key);
    }

    @Override
    public boolean delete(Object key) {
        return redisTemplate.delete(key);
    }

    @Override
    public boolean hasKey(Object key) {
        return redisTemplate.hasKey(key);
    }

    @Override
    public long delete(Object key, Object... hashKeys) {
        return hashOperations.delete(key,hashKeys);
    }

    @Override
    public boolean hasKey(Object key, Object hashKey) {
        return hashOperations.hasKey(key,hashKey);
    }

    @Override
    public Object get(Object key, Object hashKey) {
        return hashOperations.get(key,hashKey);
    }

    @Override
    public List<Object> multiGet(Object key, Collection hashKeys) {
        return hashOperations.multiGet(key,hashKeys);
    }

    @Override
    public Set<Object> keys(Object key) {
        return hashOperations.keys(key);
    }

    @Override
    public void put(Object key, Object hashKey, Object value) {
        hashOperations.put(key,hashKey,value);
    }

    @Override
    public void putAll(Object key, Map map) {
        hashOperations.putAll(key,map);
    }
}
