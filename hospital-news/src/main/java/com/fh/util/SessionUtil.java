package com.fh.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

public class SessionUtil {


    public static String getSessionId(HttpServletRequest request, HttpServletResponse response){
        //先从cookie中获取sessionId
        String sessionId = CookieUtil.getSessionId(request);
        //判断从cookie中获取sessionId为不为空 为空第一次登录直接生成一个uuid放入redis
        if(sessionId.isEmpty()){
            /*生成uuid*/
            sessionId = UUID.randomUUID().toString();
        }
        //写入cookie
        CookieUtil.writeCookie(sessionId,response,SystemConstant.COOKIE_OUT_TIME_DEFAULT);
        /*返回生成的uuid*/
        return sessionId;
    }
}
