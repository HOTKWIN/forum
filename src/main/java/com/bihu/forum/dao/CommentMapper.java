package com.bihu.forum.dao;

import com.bihu.forum.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author kwin
 * @create 2020-01-09 14:17
 */
@Mapper
public interface CommentMapper {

    List<Comment> selectCommentsByEntity(int entityType,int entityId,int offset,int limit);

    int selectCountByEntity(int entityType,int entityId);

    int insertComment(Comment comment);
}
