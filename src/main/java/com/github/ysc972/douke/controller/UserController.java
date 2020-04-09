package com.github.ysc972.douke.controller;

import com.github.ysc972.douke.common.ResponseMessage;
import com.github.ysc972.douke.common.excetion.BusinessExcetion;
import com.github.ysc972.douke.model.DkUser;
import com.github.ysc972.douke.service.thirdparty.CacheOperation;
import com.github.ysc972.douke.service.thirdparty.SmsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/15 3:39 下午
 * @changeRecord
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    SmsService smsService;
    @Resource
    CacheOperation cacheOperation;
    public static final int CODE_EXPIRED_TIME=5*60;

    @RequestMapping("/sendLoginMessage")
    public ResponseMessage sendLoginMessage(String phone){
        if(cacheOperation.get(phone)!=null){
            throw new BusinessExcetion("请不要重复发送短信");
        }
        StringBuilder code=new StringBuilder();
        for(int i=0;i<6;i++){
            Random random=new Random();
            code.append(random.nextInt(10));
        }
        smsService.sendLoginMessage(code.toString(),phone);
        cacheOperation.set(phone,code,CODE_EXPIRED_TIME);

        return ResponseMessage.success();
    }
    @RequestMapping("/test")
    public ResponseMessage test(){
        return ResponseMessage.success(new DkUser());
    }
    @RequestMapping("/exception")
    public ResponseMessage testException(){
        throw new BusinessExcetion("heheheh");
    }


}
