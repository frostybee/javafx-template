package edu.vanier.template.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controller class of the MainApp's UI.
 *
 * @author frostybee
 */
public class FXMLMainAppController {

    private final static Logger logger = LoggerFactory.getLogger(FXMLMainAppController.class);
    @FXML
    Button btnClickMe;

    @FXML
    public void initialize() {
        logger.info("Initializing MainAppController...");
        btnClickMe.setOnAction((event) -> {
            handleClickMe();
        });
    }

    private void handleClickMe() {
        System.out.println("Click me called.");
        logger.info("Click me button has been pressed...");        
    }
}