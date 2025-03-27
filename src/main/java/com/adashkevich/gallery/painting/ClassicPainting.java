package com.adashkevich.gallery.painting;

public class ClassicPainting extends Painting {
    private String era;

    public ClassicPainting(String title, String author, int year, String medium, String era, String imagePath) {
        super(title, author, year, medium, imagePath);
        this.era = era;
    }

    @Override
    public void displayInfo() {
        System.out.println("Classic Painting: " + title + " by " + author + " (" + year + ") - Era: " + era);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Era: " + era;
    }
}