package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Blog;
import com.qf.pojo.Comment;
import com.qf.pojo.User;
import com.qf.service.BlogService;
import com.qf.service.CommentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CommentService commentService;

    @RequestMapping("home")
    public String home(@RequestParam(defaultValue = "1") int pageNum, Model model){
        PageHelper.startPage(pageNum,2);

        List<Blog> blogList = blogService.getBlogs();

        PageInfo blogPageInfo = new PageInfo(blogList);

        model.addAttribute("blogPageInfo",blogPageInfo);

        return "home";
    }

    @RequestMapping("addBlogPage")
    public String registerPage(){
        return "sendblog";
    }

    @RequestMapping("addblog")
    public String addBlog(MultipartFile file,Blog blog, HttpSession session) throws IOException, ParseException {

        User user = (User) session.getAttribute("user");
        if(user != null){
            Date date = new Date();//获得系统时间.
            java.sql.Date time = new java.sql.Date(date.getTime());

            String originalFilename = file.getOriginalFilename();
            String realPath = session.getServletContext().getRealPath("/img/" + user.getUid());
            File file1 = new File(realPath);
            if(!file1.exists()){
                file1.mkdir();
            }

            File file2 = new File(file1,originalFilename);
            file.transferTo(file2);

            blog.setUid(user.getUid());
            blog.setBdate(time);
            blog.setBpicture("/img/" + user.getUid() + "/" + originalFilename);

            int i = blogService.addBlog(blog);

            if(i != -1){
                return "home";
            }else {
                return "sendblog";
            }
        }else{
            return "login";
        }
    }

    @RequestMapping("showblog")
    public String showBlog(HttpSession session, Model model, String bid){
        User user = (User) session.getAttribute("user");
        if(user != null){
            List<Comment> comments = commentService.selectCommentBybid(bid);

            if(comments.size() > 0){
                Blog blog = blogService.getBlog(bid);
                model.addAttribute("blogDetail",blog);
                return "blogdetails";
            }else {
                Blog blogFirst = blogService.getBlogFirst(bid);
                model.addAttribute("blogDetail",blogFirst);
                return "blogdetails";
            }

        }else{
            return "login";
        }
    }
}
