package edu.vanier.template.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Controller class of the MainApp's UI.
 *
 * @author frostybee
 */
public class MainAppController {

    @FXML
    Button btnClickMe;

    @FXML
    public void initialize() {
        btnClickMe.setOnAction((event) -> {
            handleClickMe();
        });
    }

    private void handleClickMe() {
        System.out.println("Click me called.");
    }
}
