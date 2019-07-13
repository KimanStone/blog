package com.qf.service;

import com.qf.pojo.Comment;

import java.util.List;

public interface CommentService {
    int addComment(Comment comment);
    List<Comment> selectCommentBybid(String bid);
}
