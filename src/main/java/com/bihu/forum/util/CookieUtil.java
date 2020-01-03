package com.bihu.forum.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * 从request中获取Cookie
 *
 * @author kwin
 * @create 2020-01-03 10:19
 */
public class CookieUtil {

    public static String getValue(HttpServletRequest request,String name){
        if (request == null || name == null){
            throw new IllegalArgumentException("参数为空！");
        }

        Cookie[] cookies = request.getCookies();
        if (cookies != null){
            for (Cookie cookie:cookies){
                if (cookie.getName().equals(name))
                    return cookie.getValue();
            }
        }

        return null;
    }
}
