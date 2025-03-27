module com.adashkevich.gallery {
    requires javafx.controls;
    requires javafx.fxml;
    
    opens com.adashkevich.gallery.ui to javafx.graphics;
}
