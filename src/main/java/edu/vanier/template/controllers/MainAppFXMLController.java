package edu.vanier.template.controllers;

import edu.vanier.template.ui.MainApp;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FXML controller class for the primary stage scene.
 *
 * @author frostybee
 */
public class MainAppFXMLController {

    private final static Logger logger = LoggerFactory.getLogger(MainAppFXMLController.class);

    @FXML
    Button btnClickMe;
    @FXML
    Button btnSwitchScene;

    @FXML
    public void initialize() {
        logger.info("Initializing MainAppController...");
        btnClickMe.setOnAction(this::handleClickMe);
        btnSwitchScene.setOnAction(this::loadSecondaryScene);
    }

    private void handleClickMe(Event e) {
        System.out.println("Click me called.");
        logger.info("Click me button has been pressed...");
    }

    private void loadSecondaryScene(Event e) {
        MainApp.switchScene(MainApp.SECONDARY_SCENE_LAYOUT, new SecondaryFXMLController());
        logger.info("Loaded the secondary scene...");
    }
}
