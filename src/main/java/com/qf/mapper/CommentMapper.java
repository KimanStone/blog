package com.qf.mapper;

import com.qf.pojo.Comment;

import java.util.List;

public interface CommentMapper {
    int addComment(Comment comment);
    List<Comment> selectCommentBybid(String bid);
}
