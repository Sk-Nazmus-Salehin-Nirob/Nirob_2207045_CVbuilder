package com.example.cvbuilder.controller;

import com.example.cvbuilder.main;
import com.example.cvbuilder.model.CVModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FormController {

    @FXML private TextField fullNameField;
    @FXML private TextField emailField;
    @FXML private TextField phoneField;
    @FXML private TextField addressField;

    @FXML private TextArea educationArea;
    @FXML private TextArea skillsArea;
    @FXML private TextArea experienceArea;
    @FXML private TextArea projectsArea;

    private static CVModel cv = new CVModel();

    // -------------------- BACK BUTTON --------------------
    @FXML
    private void goBack() throws Exception {
        main.screenController.switchTo("/com/example/cvbuilder/Home.fxml");
    }

    // -------------------- PREVIEW BUTTON --------------------
    @FXML
    protected void gotoPreview() throws Exception {

        // VALIDATION
        if (fullNameField.getText().isEmpty() ||
                emailField.getText().isEmpty() ||
                phoneField.getText().isEmpty() ||
                addressField.getText().isEmpty() ||
                educationArea.getText().isEmpty() ||
                skillsArea.getText().isEmpty() ||
                experienceArea.getText().isEmpty() ||
                projectsArea.getText().isEmpty()) {

            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("CV Creation Failed!");
            error.setHeaderText("CV Building Failed!");
            error.setContentText(
                    "You haven't filled all the sections!\n" +
                            "Please complete all fields to build your CV."
            );
            error.show();
            return;
        }

        // If validation passed → show success popup
        Alert success = new Alert(Alert.AlertType.INFORMATION);
        success.setTitle("Success!");
        success.setHeaderText("Congratulations!");
        success.setContentText("Your CV has been successfully created!");
        success.show();

        // Fill model
        cv.setFullName(fullNameField.getText());
        cv.setEmail(emailField.getText());
        cv.setPhone(phoneField.getText());
        cv.setAddress(addressField.getText());
        cv.setEducation(educationArea.getText());
        cv.setSkills(skillsArea.getText());
        cv.setExperience(experienceArea.getText());
        cv.setProjects(projectsArea.getText());

        // Load preview screen
        FXMLLoader loader = main.screenController.switchToWithLoader(
                "/com/example/cvbuilder/Preview.fxml"
        );

        PreviewController previewController = loader.getController();
        previewController.loadData(cv);
    }
}
