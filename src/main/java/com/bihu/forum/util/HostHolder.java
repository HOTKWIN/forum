package com.bihu.forum.util;

import com.bihu.forum.entity.User;
import org.springframework.stereotype.Component;

/**
 * 用于持有用户信息
 *
 * @author kwin
 * @create 2020-01-03 10:24
 */
@Component
public class HostHolder {

    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user){
        users.set(user);
    }

    public User getUser(){
        return users.get();
    }

    public void clear(){
        users.remove();
    }
}
