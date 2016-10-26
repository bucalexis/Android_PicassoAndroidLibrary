package com.example.bucalexis.android_picassoandroidlibrary;

/**
 * Created by NanX3 on 25/10/2016.
 */

public class Movie {
    private String name;
    private boolean isFavorite = false;
    private String imageUrl;

    public Movie(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }
    public boolean getIsFavorite() {
        return isFavorite;
    }
    public void setIsFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public void toggleFavorite() {
        isFavorite = !isFavorite;
    }
    public String getImageUrl() {
        return imageUrl;
    }
}