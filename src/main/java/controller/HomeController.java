package com.example.cvbuilder.controller;

import com.example.cvbuilder.main;
import javafx.fxml.FXML;

public class HomeController {

    @FXML
    protected void gotoForm() throws Exception {
        main.screenController.switchTo("/com/example/cvbuilder/Form.fxml");
    }
}
