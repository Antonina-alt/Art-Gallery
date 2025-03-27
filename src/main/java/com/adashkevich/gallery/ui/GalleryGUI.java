package com.adashkevich.gallery.ui;

import com.adashkevich.gallery.collection.GalleryCollection;
import com.adashkevich.gallery.artwork.Artwork;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.File;

public class GalleryGUI extends Application {
    private static GalleryCollection gallery;

    public static void setGallery(GalleryCollection collection) {
        gallery = collection;
    }

    @Override
    public void start(Stage primaryStage) {
        if (gallery == null) {
            throw new IllegalStateException("GalleryCollection is not set. Use setGallery() before launching.");
        }

        VBox mainLayout = new VBox(10);
        mainLayout.setStyle("-fx-padding: 20; -fx-background-color: #f5f5f5;");

        ScrollPane scrollPane = new ScrollPane(mainLayout);
        scrollPane.setFitToWidth(true);
        scrollPane.setStyle("-fx-background: transparent;");

        displayGallery(mainLayout);

        Scene scene = new Scene(scrollPane, 900, 600);
        primaryStage.setTitle("Gallery Viewer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void displayGallery(VBox mainLayout) {
        for (Artwork artwork : gallery.getArtworks()) {
            BorderPane artworkPanel = new BorderPane();
            artworkPanel.setStyle("-fx-border-color: black; -fx-border-width: 2px; -fx-background-color: white;");
            artworkPanel.setPadding(new Insets(10));

            ImageView imageView = new ImageView();
            File file = new File(artwork.getImagePath());
            if (file.exists()) {
                Image image = new Image(file.toURI().toString());
                imageView.setImage(image);
                imageView.setPreserveRatio(true);
                imageView.setFitWidth(200);
                imageView.setFitHeight(200);
            }
            VBox imageBox = new VBox(imageView);
            imageBox.setPadding(new Insets(10));
            imageBox.setStyle("-fx-background-color: #ffffff; -fx-border-color: #cccccc; -fx-padding: 10px;");
            artworkPanel.setLeft(imageBox);

            VBox infoBox = new VBox(10);
            infoBox.setPadding(new Insets(10, 20, 10, 20));
            infoBox.setStyle("-fx-background-color: #ffffff; -fx-border-color: #cccccc; -fx-padding: 10px;");

            Label titleLabel = new Label("Title: " + artwork.getTitle());
            titleLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px; -fx-text-fill: #333333;");
            Label authorLabel = new Label("Artist: " + artwork.getAuthor());
            authorLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #555555;");
            Label yearLabel = new Label("Year: " + artwork.getYear());
            yearLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #777777;");
            Label detailsLabel = new Label("Details: " + artwork.getDetails());
            detailsLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #777777;");

            infoBox.getChildren().addAll(titleLabel, authorLabel, yearLabel, detailsLabel);
            artworkPanel.setCenter(infoBox);

            VBox wrapper = new VBox(artworkPanel);
            wrapper.setPadding(new Insets(10, 40, 10, 40));
            mainLayout.getChildren().add(wrapper);
        }
    }

    public static void launchGallery(GalleryCollection galleryCollection) {
        setGallery(galleryCollection);
        Application.launch(GalleryGUI.class);
    }
}
