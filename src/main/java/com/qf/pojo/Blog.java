package com.qf.pojo;

import org.springframework.stereotype.Component;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Component
public class Blog implements Serializable {
    private String bid;
    private String btitle;
    private String bcontent;
    private Date bdate;
    private int blike;
    private String uid;
    private String bpicture;
    private List<Comment> commentList;

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public int getBlike() {
        return blike;
    }

    public void setBlike(int blike) {
        this.blike = blike;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getBpicture() {
        return bpicture;
    }

    public void setBpicture(String bpicture) {
        this.bpicture = bpicture;
    }

    public Blog(String bid, String btitle, String bcontent, Date bdate, int blike, String uid, String bpicture, List<Comment> commentList) {
        this.bid = bid;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bdate = bdate;
        this.blike = blike;
        this.uid = uid;
        this.bpicture = bpicture;
        this.commentList = commentList;
    }

    public Blog() {
    }
}
