package com.adashkevich.gallery.main;

import com.adashkevich.gallery.painting.*;
import com.adashkevich.gallery.sculpture.Sculpture;
import com.adashkevich.gallery.photography.Photograph;
import com.adashkevich.gallery.collection.GalleryCollection;
import com.adashkevich.gallery.ui.GalleryGUI;

public class Main {
    public static void main(String[] args) {
        GalleryCollection gallery = new GalleryCollection();

        // Живопись
        gallery.addArtwork(new ModernPainting("Composition VIII", "Kandinsky", 1923, "Oil", "Abstract", "src/main/java/com/adashkevich/gallery/pictures/comp8.jpg"));
        gallery.addArtwork(new ModernPainting("The Persistence of Memory", "Salvador Dalí", 1931, "Oil", "Surrealism", "src/main/java/com/adashkevich/gallery/pictures/The_Persistence_of_Memory.jpg"));
        gallery.addArtwork(new ClassicPainting("Mona Lisa", "Da Vinci", 1503, "Oil", "Renaissance", "src/main/java/com/adashkevich/gallery/pictures/Mona_Lisa.jpg"));
        gallery.addArtwork(new ClassicPainting("The Starry Night", "Van Gogh", 1889, "Oil", "Post-Impressionism", "src/main/java/com/adashkevich/gallery/pictures/Starry_Night.jpg"));

        // Скульптуры
        gallery.addArtwork(new Sculpture("David", "Michelangelo", 1504, "Marble", "src/main/java/com/adashkevich/gallery/pictures/David.jpg"));
        gallery.addArtwork(new Sculpture("The Thinker", "Auguste Rodin", 1904, "Bronze", "src/main/java/com/adashkevich/gallery/pictures/Musée_Rodin.jpg"));
        gallery.addArtwork(new Sculpture("Venus de Milo", "Unknown", -130, "Marble", "src/main/java/com/adashkevich/gallery/pictures/Vénus_de_Milo.jpg"));

        // Фотографии
        gallery.addArtwork(new Photograph("Moon Landing", "NASA", 1969, "640x480", "Hasselblad 500EL", "src/main/java/com/adashkevich/gallery/pictures/moon.jpg"));
        gallery.addArtwork(new Photograph("Afghan Girl", "Steve McCurry", 1984, "1200x800", "Nikon FM2", "src/main/java/com/adashkevich/gallery/pictures/Sharbat_Gula.jpg"));
        gallery.addArtwork(new Photograph("Earthrise", "William Anders", 1968, "1800x1200", "Hasselblad 500EL", "src/main/java/com/adashkevich/gallery/pictures/Earthrise.jpg"));


        GalleryGUI.launchGallery(gallery);
    }
}