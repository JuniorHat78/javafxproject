module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.desktop;
    requires jfoenix;
    requires controlsfx;

    opens Control to javafx.fxml;
    opens Model to javafx.fxml;
    exports Model;
    exports Control;
}