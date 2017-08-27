package com.shijian.library.entity;


import java.io.File;
import java.util.Date;

public class Book {
    private String isbn;//图书isbn编号
    private String bookName;//图书名称
    private String author;//图书作者
    private String publisher;//出版商
    private Date publishDate;//发行日期
    private int publishTime;//印刷次数
    private int price;//单价
    private String typeName;//类型名称
    private int total;//图书馆藏总量
    private int available;//图书可借阅数量
    private File firstImg;//图书封面

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(int publishTime) {
        this.publishTime = publishTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public File getFirstImg() {
        return firstImg;
    }

    public void setFirstImg(File firstImg) {
        this.firstImg = firstImg;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishDate=" + publishDate +
                ", publishTime=" + publishTime +
                ", price=" + price +
                ", typeName='" + typeName + '\'' +
                ", total=" + total +
                ", available=" + available +
                ", firstImg=" + firstImg +
                '}';
    }
}
