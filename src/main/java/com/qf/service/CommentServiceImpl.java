package com.qf.service;

import com.qf.mapper.CommentMapper;
import com.qf.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentMapper commentMapper;
    @Override
    public int addComment(Comment comment) {
        return commentMapper.addComment(comment);
    }

    @Override
    public List<Comment> selectCommentBybid(String bid) {
        return commentMapper.selectCommentBybid(bid);
    }


}
