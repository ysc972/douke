package com.github.ysc972.douke;

import com.github.ysc972.douke.model.DkUser;
import com.github.ysc972.douke.repository.UserRepository;
import com.github.ysc972.douke.service.LikeRedisService;
import com.github.ysc972.douke.service.UserService;
import com.github.ysc972.douke.service.thirdparty.SmsService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
@Slf4j
@SpringBootTest
class DoukeApplicationTests {


    @Resource
    RedisTemplate redisTemplate;

    @Resource
    UserService userService;

    @Resource
    UserRepository userRepository;

    @Resource
    SmsService smsService;

    @Resource
    LikeRedisService likeRedisService;

    @Test
    void test() throws Exception{
        DkUser user = new DkUser();
        user.setPhone("123456");

        userRepository.save(user);
    }
    @Test
    void testSendSms(){
        smsService.sendLoginMessage("1233","15127765662");
    }
    @Test
    void contextLoads() {

        System.out.println(userService.getUser("123456"));
    }

    @Test
    void testRedis(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("hello","world");
        System.out.println(valueOperations.get("hello"));
    }

    @Test
    void likedTest(){
        likeRedisService.likedRedis("0001","0002");

        System.out.println(likeRedisService.userIfLiked("0001", "0002"));

        likeRedisService.saveLikeCount("0002",4);

        System.out.println(likeRedisService.likedCountIncr("0002"));
    }
}
