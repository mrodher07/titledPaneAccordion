module com.example.titledpaneaccordion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.titledpaneaccordion to javafx.fxml;
    exports com.example.titledpaneaccordion;
}