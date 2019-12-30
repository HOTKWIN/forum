package com.bihu.forum.dao;

import com.bihu.forum.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author kwin
 * @create 2019-12-27 23:48
 */
@Mapper
public interface UserMapper {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User selectById(int id);

    /**
     * 根据名字查询用户
      * @param username
     * @return
     */
    User selectByName(String username);

    /**
     * 根据邮箱查询用户
     * @param email
     * @return
     */
    User selectByEmail(String email);

    /**
     * 新增用户
     * @param user
     * @return
     */
    void insertUser(User user);

    /**
     * 更改用户状态
     * @param id
     * @param status
     * @return
     */
    void updateStatus(int id,int status);

    /**
     * 更改headerUrl
     * @param id
     * @param headerUrl
     * @return
     */
    void updateHeaderUrl(int id,String headerUrl);

    /**
     * 更改密码
     * @param id
     * @param password
     * @return
     */
    void updatePassword(int id,String password);
}
