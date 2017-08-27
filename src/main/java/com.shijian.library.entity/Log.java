package com.shijian.library.entity;

import java.util.Date;

//次实体类为借阅记录实体类
public class Log {
    private String numberId;//借阅人借书证号
    private String isbn;//图书的isbn编号，相当于图书的唯一标示
    private Date bdate;//图书借阅时间日期
    private int state;//1为在借，2为已经归还,3为自定义状态

    public String getNumber() {
        return numberId;
    }

    public void setNumber(String number) {
        this.numberId = number;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public int isState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Log{" +
                "number='" + numberId + '\'' +
                ", isbn='" + isbn + '\'' +
                ", bdate=" + bdate +
                ", state=" + state +
                '}';
    }
}
