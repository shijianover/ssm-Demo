package com.shijian.library.entity;

public class User {
    private int uid;//用户编号
    private String numberId;//借书证号
    private String logname;//登录名
    private String pwd;//密码
    private String realName;//真实姓名
    private int role;//角色，权限

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getNumber() {
        return numberId;
    }

    public void setNumber(String number) {
        this.numberId = number;
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", number='" + numberId + '\'' +
                ", logname='" + logname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", realName='" + realName + '\'' +
                ", role=" + role +
                '}';
    }
}
