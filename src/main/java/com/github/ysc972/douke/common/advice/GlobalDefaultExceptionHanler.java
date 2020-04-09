package com.github.ysc972.douke.common.advice;

import com.github.ysc972.douke.common.ResponseMessage;
import com.github.ysc972.douke.common.excetion.BusinessExcetion;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/15 4:59 下午
 * @changeRecord
 */
@ControllerAdvice
public class GlobalDefaultExceptionHanler {


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseMessage defultExcepitonHandler(HttpServletRequest request,Exception e){
        e.printStackTrace();
        if(e instanceof BusinessExcetion){
            BusinessExcetion businessExcetion=(BusinessExcetion)e;
            return ResponseMessage.error(businessExcetion.getCode(),businessExcetion.getMessage());
        }
        return ResponseMessage.error(-1,"系统错误");
    }
}
