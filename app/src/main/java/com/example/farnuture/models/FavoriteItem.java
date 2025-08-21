package com.example.farnuture.models;

public class FavoriteItem {
    private int imageResId;
    private String title;
    private String rating;
    private String price;

    public FavoriteItem(int imageResId, String title, String rating, String price) {
        this.imageResId = imageResId;
        this.title = title;
        this.rating = rating;
        this.price = price;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }

    public String getPrice() {
        return price;
    }
}
