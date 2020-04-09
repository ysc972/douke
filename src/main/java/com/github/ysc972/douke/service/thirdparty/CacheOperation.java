package com.github.ysc972.douke.service.thirdparty;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/15 6:45 下午
 * @changeRecord
 */
public interface CacheOperation {

    void set(Object key,Object value);

    long increment(Object key);

    long decrement(Object key);

    void set(Object key,Object value,long timeout);

    Object get(Object key);

    boolean delete(Object key);

    boolean hasKey(Object key);

    long delete(Object key,Object... hashKeys);

    boolean hasKey(Object key,Object hashKey);

    Object get(Object key,Object hashKey);

    List<Object> multiGet(Object key, Collection hashKeys);

    Set<Object> keys(Object key);

    void put(Object key ,Object hashKey,Object value);

    void putAll(Object key, Map map);

}
