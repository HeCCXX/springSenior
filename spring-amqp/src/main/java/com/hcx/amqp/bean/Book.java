package com.hcx.amqp.bean;

/**
 * @ClassName Book
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2020-01-22 17:05
 * @Version 1.0
 **/
public class Book {

    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
