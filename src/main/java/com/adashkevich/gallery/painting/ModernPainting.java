package com.adashkevich.gallery.painting;

public class ModernPainting extends Painting {
    private String style;

    public ModernPainting(String title, String author, int year, String medium, String style, String imagePath) {
        super(title, author, year, medium, imagePath);
        this.style = style;
    }

    @Override
    public void displayInfo() {
        System.out.println("Modern Painting: " + title + " by " + author + " (" + year + ") - Style: " + style);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Style: " + style;
    }
}