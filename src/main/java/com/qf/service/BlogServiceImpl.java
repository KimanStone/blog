package com.qf.service;

import com.qf.mapper.BlogMapper;
import com.qf.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogMapper blogMapper;
    @Override
    public int addBlog(Blog blog) {
        return blogMapper.addBlog(blog);
    }

    @Override
    public List<Blog> getBlogs() {
        return blogMapper.getBlogs();
    }

    @Override
    public Blog getBlog(String bid) {
        return blogMapper.getBlog(bid);
    }

    @Override
    public Blog getBlogFirst(String bid) {
        return blogMapper.getBlogFirst(bid);
    }
}
