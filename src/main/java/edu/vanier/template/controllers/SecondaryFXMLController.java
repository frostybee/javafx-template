package edu.vanier.template.controllers;

import edu.vanier.template.ui.MainApp;
import java.io.IOException;
import java.util.logging.Level;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FXML controller class for the secondary scene.
 *
 * @author frostybee
 */
public class SecondaryFXMLController {

    private final static Logger logger = LoggerFactory.getLogger(SecondaryFXMLController.class);

    @FXML
    Button btnSwitchScene;

    @FXML
    public void initialize() {
        logger.info("Initializing MainAppController...");
        btnSwitchScene.setOnAction(this::loadPrimaryScene);
    }

    private void loadPrimaryScene(Event e) {
        MainApp.switchScene(MainApp.MAINAPP_SCENE);
        logger.info("Loaded the primary scene...");
    }
}
