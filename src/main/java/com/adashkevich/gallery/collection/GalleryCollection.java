package com.adashkevich.gallery.collection;

import com.adashkevich.gallery.artwork.Artwork;
import java.util.ArrayList;
import java.util.List;

public class GalleryCollection {
    private List<Artwork> artworks = new ArrayList<>();

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public List<Artwork> getArtworks() {
        return artworks;
    }
}
