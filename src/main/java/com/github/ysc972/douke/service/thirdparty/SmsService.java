package com.github.ysc972.douke.service.thirdparty;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/15 2:55 下午
 * @changeRecord
 */
public interface SmsService {
    void sendLoginMessage(String code,String phone);
}
