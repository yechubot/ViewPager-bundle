package com.example.yechu.movies.models;

public class Movie {
    private String image;
    private String title;
    private String title_eng;

    public Movie(String image, String title, String title_eng) {
        this.image = image;
        this.title = title;
        this.title_eng = title_eng;
    }

    public Movie() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_eng() {
        return title_eng;
    }

    public void setTitle_eng(String title_eng) {
        this.title_eng = title_eng;
    }
}
