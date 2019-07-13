package com.qf.controller;

import com.qf.pojo.Comment;
import com.qf.pojo.User;
import com.qf.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("addcomment")
    public String addcomment(Comment comment, HttpSession session){

        User user = (User) session.getAttribute("user");
        Date date = new Date();
        java.sql.Date time = new java.sql.Date(date.getTime());

        comment.setCdate(time);
        comment.setUid(user.getUid());

        int i = commentService.addComment(comment);
        if(i != -1){
            return "forward:showblog" ;
        }else {
            return "error";
        }
    }
}
