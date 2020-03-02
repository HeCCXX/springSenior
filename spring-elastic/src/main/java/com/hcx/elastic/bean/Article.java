package com.hcx.elastic.bean;

import io.searchbox.annotations.JestId;

/**
 * @ClassName Article
 * @Description 文章内容实体类
 * @Author 贺楚翔
 * @Date 2020-03-02 10:38
 * @Version 1.0
 **/
public class Article {
    @JestId
    private Integer id;
    private String author;
    private String title;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
