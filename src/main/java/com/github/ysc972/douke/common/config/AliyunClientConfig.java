package com.github.ysc972.douke.common.config;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.profile.DefaultProfile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/15 3:02 下午
 * @changeRecord
 */
@Configuration
public class AliyunClientConfig {

    @Bean(name = "aliyunClient")
    public IAcsClient getAliyunClient(){
        DefaultProfile profile =DefaultProfile.getProfile("cn-hangzhou",
                "LTAI4FcwXgo79ZPArvovzSir","dHtqXVyuU3JKcl3E4LHr7AUOSvfXon");
        return new DefaultAcsClient(profile);
    }


}
