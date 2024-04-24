package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "author")
public class Author {
    @Id
    private String id;
    private String name;
    private String genre;

    // 构造函数
    public Author() {
    }

    public Author(String id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    // Getter 方法
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    // Setter 方法
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
