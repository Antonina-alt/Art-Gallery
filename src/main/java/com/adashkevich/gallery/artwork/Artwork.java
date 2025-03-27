package com.adashkevich.gallery.artwork;

public abstract class Artwork {
    protected String title;
    protected String author;
    protected int year;
    protected String imagePath;

    public Artwork(String title, String author, int year, String imagePath) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.imagePath = imagePath;
    }

    public abstract void displayInfo();

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public String getImagePath() { return imagePath; }
    public abstract String getDetails();
}