package com.qf.service;



import com.qf.pojo.Blog;
import java.util.List;

public interface BlogService {
    int addBlog(Blog blog);
    List<Blog> getBlogs();
    Blog getBlog(String bid);
    Blog getBlogFirst(String bid);
}
