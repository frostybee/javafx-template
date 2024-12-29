package edu.vanier.template.controllers;

import edu.vanier.template.ui.MainApp;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.kordamp.ikonli.fontawesome5.FontAwesomeRegular;
import org.kordamp.ikonli.javafx.FontIcon;
import org.kordamp.ikonli.materialdesign2.MaterialDesignA;
import org.kordamp.ikonli.materialdesign2.MaterialDesignB;
import org.kordamp.ikonli.materialdesign2.MaterialDesignC;
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
    Button btnPlay;
    @FXML
    Button btnSwitchScene;

    @FXML
    public void initialize() {
        logger.info("Initializing MainAppController...");
        btnPlay.setOnAction(this::handleClickMe);
        btnSwitchScene.setOnAction(this::loadSecondaryScene);
        addFontIcons();
    }

    private void handleClickMe(Event e) {
        System.out.println("Playing...");
        logger.info("Play button has been clicked...");
    }

    private void loadSecondaryScene(Event e) {
        MainApp.switchScene(MainApp.SECONDARY_SCENE);
        logger.info("Loaded the secondary scene...");
    }

    private void addFontIcons() {
        // @see: https://kordamp.org/ikonli/cheat-sheet-fontawesome5.html
        FontIcon playIcon = new FontIcon(FontAwesomeRegular.SHARE_SQUARE);
        // Alternatively, Material Design icon set can be used as follows.
        // @see: https://kordamp.org/ikonli/#_materialdesign2_latest
        // @see: https://kordamp.org/ikonli/cheat-sheet-medicons.html
        //FontIcon searchIcon = new FontIcon(MaterialDesignA.ATOM);
        btnPlay.setGraphic(playIcon);
        btnPlay.setStyle("-fx-font-size: 16px;");
        FontIcon switchIcon = new FontIcon(MaterialDesignA.ATOM);
        btnSwitchScene.setGraphic(switchIcon);
        btnSwitchScene.setStyle("-fx-font-size: 16px;");
    }
}
