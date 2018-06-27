package com.olq.service.model;


public class User {

    private long uid;
//    private String email;
    private String password;
    private String username;
//    private String role;
//    private int status;
//    private Date regTime;
//    private String regIp;


    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
