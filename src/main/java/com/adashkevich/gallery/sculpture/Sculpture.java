package com.adashkevich.gallery.sculpture;

import com.adashkevich.gallery.artwork.Artwork;

public class Sculpture extends Artwork {
    private String material;

    public Sculpture(String title, String author, int year, String material, String imagePath) {
        super(title, author, year, imagePath);
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sculpture: " + title + " by " + author + " (" + year + ") - Material: " + material);
    }

    @Override
    public String getDetails() {
        return "Material: " + material;
    }
}

