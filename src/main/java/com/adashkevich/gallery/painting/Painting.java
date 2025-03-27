package com.adashkevich.gallery.painting;

import com.adashkevich.gallery.artwork.Artwork;

public class Painting extends Artwork {
    protected String medium;

    public Painting(String title, String author, int year, String medium, String imagePath) {
        super(title, author, year, imagePath);
        this.medium = medium;
    }

    @Override
    public void displayInfo() {
        System.out.println("Painting: " + title + " by " + author + " (" + year + ") - Medium: " + medium);
    }

    @Override
    public String getDetails() {
        return "Medium: " + medium;
    }
}