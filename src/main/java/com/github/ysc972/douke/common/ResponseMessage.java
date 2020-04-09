package com.github.ysc972.douke.common;

import lombok.Data;

import java.util.ArrayList;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/15 4:16 下午
 * @changeRecord
 */
@Data
public class ResponseMessage {

    private boolean state;
    private int code;
    private Object data;
    private String message;

    public ResponseMessage(){}

    public ResponseMessage(boolean state){
        this.state=state;
        this.code=getCodeByState(state);
        this.message=getMessageByState(state);
        this.data=new ArrayList();
    }

    private String getMessageByState(boolean state) {
        return state?"操作成功":"操作失败";
    }
    public ResponseMessage(boolean state,Object data){
        this.state=state;
        this.code=getCodeByState(state);
        this.message=getMessageByState(state);
        this.data=data;
    }

    public ResponseMessage(boolean state,String message){
        this.state=state;
        this.code=getCodeByState(state);
        this.message=message;
        this.data=new ArrayList();
    }
    public ResponseMessage(boolean state,String message,int code){
        this.state=state;
        this.message=message;
        this.code=code;
        this.data=new ArrayList();
    }
    public static ResponseMessage success(){
        return new ResponseMessage (true);
    }

    public static ResponseMessage success(Object date){
        return new ResponseMessage(true,date);
    }
    public static ResponseMessage error(){
        return new ResponseMessage(false);
    }

    public static ResponseMessage error(String msg){
        return new ResponseMessage(false,msg);
    }
    public static ResponseMessage error(int code,String msg){
        return new ResponseMessage(false,msg,code);
    }


    int getCodeByState(boolean state){
        return state?200:500;
    }

}
