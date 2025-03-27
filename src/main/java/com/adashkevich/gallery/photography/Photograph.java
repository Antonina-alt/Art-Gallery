package com.adashkevich.gallery.photography;

import com.adashkevich.gallery.artwork.Artwork;

public class Photograph extends Artwork {
    private String resolution;
    private String cameraModel;

    public Photograph(String title, String author, int year, String resolution, String cameraModel, String imagePath) {
        super(title, author, year, imagePath);
        this.resolution = resolution;
        this.cameraModel = cameraModel;
    }

    @Override
    public void displayInfo() {
        System.out.println("Photograph: " + title + " by " + author + " (" + year + ") - Resolution: " + resolution + ", Camera: " + cameraModel);
    }

    @Override
    public String getDetails() {
        return "Resolution: " + resolution + ", Camera: " + cameraModel;
    }
}