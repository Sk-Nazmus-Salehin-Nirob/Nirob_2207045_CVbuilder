package com.example.cvbuilder.controller;

import com.example.cvbuilder.main;
import com.example.cvbuilder.model.CVModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

    @FXML
    protected void gotoPreview() throws Exception {

        // Fill model
        cv.setFullName(fullNameField.getText());
        cv.setEmail(emailField.getText());
        cv.setPhone(phoneField.getText());
        cv.setAddress(addressField.getText());
        cv.setEducation(educationArea.getText());
        cv.setSkills(skillsArea.getText());
        cv.setExperience(experienceArea.getText());
        cv.setProjects(projectsArea.getText());

        // Load preview
        FXMLLoader loader = main.screenController.switchToWithLoader(
                "/com/example/cvbuilder/Preview.fxml"
        );

        PreviewController previewController = loader.getController();
        previewController.loadData(cv);
    }
}
