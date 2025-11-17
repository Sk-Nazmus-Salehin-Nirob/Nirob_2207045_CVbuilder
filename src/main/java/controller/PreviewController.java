package com.example.cvbuilder.controller;

import com.example.cvbuilder.main;
import com.example.cvbuilder.model.CVModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class PreviewController {

    @FXML private Label nameLabel;
    @FXML private Label emailLabel;
    @FXML private Label phoneLabel;
    @FXML private Label addressLabel;

    @FXML private TextArea educationText;
    @FXML private TextArea skillsText;
    @FXML private TextArea experienceText;
    @FXML private TextArea projectsText;

    // -------------------- BACK BUTTON --------------------
    @FXML
    private void goBack() throws Exception {
        main.screenController.switchTo("/com/example/cvbuilder/Form.fxml");
    }

    // -------------------- LOAD DATA --------------------
    public void loadData(CVModel cv) {

        nameLabel.setText(cv.getFullName());
        emailLabel.setText(cv.getEmail());
        phoneLabel.setText(cv.getPhone());
        addressLabel.setText(cv.getAddress());

        educationText.setText(cv.getEducation());
        skillsText.setText(cv.getSkills());
        experienceText.setText(cv.getExperience());
        projectsText.setText(cv.getProjects());
    }
}
