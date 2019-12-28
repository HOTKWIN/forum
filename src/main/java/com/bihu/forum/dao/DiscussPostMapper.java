package com.bihu.forum.dao;

import com.bihu.forum.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kwin
 * @create 2019-12-27 23:03
 */
@Mapper
public interface DiscussPostMapper {

    /**
     * 查询贴子
     * @param userId 用户id
     * @param offset 每页开始的行号
     * @param limit  每页的行数
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    /**
     * 根据用户id查询贴子
     * @param userId
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);
}
