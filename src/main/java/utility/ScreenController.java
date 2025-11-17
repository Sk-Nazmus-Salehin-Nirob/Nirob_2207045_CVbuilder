package com.example.cvbuilder.utility;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ScreenController {

    private Stage stage;

    public ScreenController(Stage stage) {
        this.stage = stage;
    }

    public void switchTo(String fxmlPath) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        // ADD CSS FILE HERE
        scene.getStylesheets().add(
                getClass().getResource("/com/example/cvbuilder/styles.css").toExternalForm()
        );

        stage.setScene(scene);
        stage.show();
    }

    public FXMLLoader switchToWithLoader(String fxmlPath) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        // ADD CSS FILE HERE
        scene.getStylesheets().add(
                getClass().getResource("/com/example/cvbuilder/styles.css").toExternalForm()
        );

        stage.setScene(scene);
        stage.show();

        return loader;
    }
}
