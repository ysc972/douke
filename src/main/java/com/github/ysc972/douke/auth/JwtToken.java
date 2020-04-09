package com.github.ysc972.douke.auth;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/14 9:44 上午
 * @changeRecord
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token){
        this.token=token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
