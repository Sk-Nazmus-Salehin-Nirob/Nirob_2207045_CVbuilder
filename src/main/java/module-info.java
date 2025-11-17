module com.example.cvbuilder {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.cvbuilder.controller to javafx.fxml;
    exports com.example.cvbuilder.controller;

    opens com.example.cvbuilder.model to javafx.fxml;
    exports com.example.cvbuilder.model;

    opens com.example.cvbuilder to javafx.fxml;
    exports com.example.cvbuilder;

    exports com.example.cvbuilder.utility;
    opens com.example.cvbuilder.utility to javafx.fxml;
}
