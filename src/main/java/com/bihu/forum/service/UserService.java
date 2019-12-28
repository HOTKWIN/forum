package com.bihu.forum.service;

import com.bihu.forum.dao.UserMapper;
import com.bihu.forum.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kwin
 * @create 2019-12-28 0:05
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id){
        return userMapper.selectById(id);
    }
}
