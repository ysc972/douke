package com.github.ysc972.douke.common.excetion;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/15 4:57 下午
 * @changeRecord
 */
public class BusinessExcetion extends RuntimeException {

    @Getter
    int code=0;
    @Setter
    String msg;

    public BusinessExcetion(){}

    public BusinessExcetion(String msg){
        super(msg);
        this.code=-1;
    }

    public BusinessExcetion(String msg,int code){
        super(msg);
        this.code=code;
    }


}
