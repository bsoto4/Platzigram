package com.zeze.platzigram.model;

/**
 * Created by Bryam Soto on 09/01/2017.
 */

public class CardPicture {

    private String picture;
    private String username;
    private String time;
    private String like = "0";

    public CardPicture(String picture, String username, String time, String like) {
        this.picture = picture;
        this.username = username;
        this.time = time;
        this.like = like;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
