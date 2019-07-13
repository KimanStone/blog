package com.qf.mapper;


import com.qf.pojo.Blog;

import java.sql.Date;
import java.util.List;

public interface BlogMapper {
    int addBlog(Blog blog);
    List<Blog> getBlogs();
    Blog getBlog(String bid);
    Blog getBlogFirst(String bid);
}
