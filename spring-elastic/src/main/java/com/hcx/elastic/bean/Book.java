package com.hcx.elastic.bean;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @ClassName Book
 * @Description book实体类
 * @Author 贺楚翔
 * @Date 2020-03-02 10:38
 * @Version 1.0
 **/
@Document(indexName = "hcx",type = "book")
public class Book {

    private Integer id;
    private String bookName;
    private String author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
