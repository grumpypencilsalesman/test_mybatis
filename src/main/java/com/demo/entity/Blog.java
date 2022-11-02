package com.demo.entity;




import java.util.Date;

public class Blog {
    private int id;
    private String title;
    private String author;
    private String time;
    private int read_count;
    private String label;
    private int like;
    private int visible;

    public Blog(){}

    public Blog(int id, String title, String author, String time, int read_count, String label, int like, int visible) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.time = time;
        this.read_count = read_count;
        this.label = label;
        this.like = like;
        this.visible = visible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getRead_count() {
        return read_count;
    }

    public void setRead_count(int read_count) {
        this.read_count = read_count;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", time='" + time + '\'' +
                ", read_count=" + read_count +
                ", label='" + label + '\'' +
                ", like=" + like +
                ", visible=" + visible +
                '}';
    }
}