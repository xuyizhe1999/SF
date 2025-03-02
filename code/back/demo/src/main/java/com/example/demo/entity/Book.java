package com.example.demo.entity;

import java.sql.Date;
public class Book {
    private int bid;
    private int uid;
    private String bookname;
    private String kind;
    private String txt; //mongo
    private String sound;//mongo
    private String img;//mongo
    private String lst;
    private boolean shared;

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public boolean getShared() {
        return shared;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookname() {
        return bookname;
    }

    public int getBid() {
        return this.bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getUid() {
        return this.uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getTxt() {
        return this.txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }


    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLst() {
        return this.lst;
    }

    public void setLst(String lst) {
        this.lst = lst;
    }
}
