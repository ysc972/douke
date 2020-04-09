package com.github.ysc972.douke.common.enmu;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/15 3:26 下午
 * @changeRecord
 */

@AllArgsConstructor
public enum MessageType {

    LOGIN("login","SMS_182675219"),
    REGISTER("register","SMS_169897921");
    @Getter
    String type;
    @Getter
    String templatedId;


}
