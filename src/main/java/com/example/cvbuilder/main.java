package com.example.cvbuilder;

import com.example.cvbuilder.utility.ScreenController;
import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application {

    public static ScreenController screenController;

    @Override
    public void start(Stage stage) throws Exception {
        screenController = new ScreenController(stage);
        screenController.switchTo("/com/example/cvbuilder/Home.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}
