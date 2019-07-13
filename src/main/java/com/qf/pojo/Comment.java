package com.qf.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
@Component
public class Comment implements Serializable {
    private String cid;
    private String ccontent;
    private Date cdate;
    private String bid;
    private String uid;



    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }

    public Comment(String cid, String ccontent, Date cdate, String bid, String uid) {
        this.cid = cid;
        this.ccontent = ccontent;
        this.cdate = cdate;
        this.bid = bid;
        this.uid = uid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Comment() {
    }
}
