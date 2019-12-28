package com.bihu.forum.service;

import com.bihu.forum.dao.DiscussPostMapper;
import com.bihu.forum.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kwin
 * @create 2019-12-28 0:00
 */
@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userId,int offSet,int limit){
        return discussPostMapper.selectDiscussPosts(userId,offSet,limit);
    }

    public int findDiscussPostRows(int userId){
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
