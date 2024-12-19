package edu.vanier.template;

import edu.vanier.template.controllers.MainAppFXMLController;
import java.io.IOException;
import java.util.logging.Level;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is a JavaFX project template to be used for creating GUI applications.
 *
 * The JavaFX GUI framework (version: 22.0.2) is linked to this project in the
 * build.gradle file.
 * @link: https://openjfx.io/javadoc/22/
 * @see: /Build Scripts/build.gradle
 * @author frostybee.
 */
public class MainApp extends Application {

    public static final String MAINAPP_SCENE_LAYOUT = "MainApp_layout";
    public static final String SECONDARY_SCENE_LAYOUT = "secondary_layout";
    private final static Logger logger = LoggerFactory.getLogger(MainApp.class);
    private static Scene scene;

    @Override
    public void stop() {
        // TODO: Here, we need to perform teardown operations 
        // such as stopping animation, etc.
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            logger.info("Bootstrapping the application...");
            // Load the scene of the primary stage.
            Parent root = loadFXML(MAINAPP_SCENE_LAYOUT, new MainAppFXMLController());
            scene = new Scene(root, 640, 480);
            primaryStage.setScene(scene);
            primaryStage.sizeToScene();
            // Request putting this appliation's main window on top of other 
            // already-opened windows upon launching the app.
            primaryStage.setAlwaysOnTop(true);
            primaryStage.show();
            primaryStage.setAlwaysOnTop(false);
        } catch (IOException ex) {
            logger.error(ex.getMessage(), ex);
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Switches the current scene to the one defined by the specified FXML file.
     * This method loads the FXML file and sets the root of the scene to the
     * corresponding view.
     *
     * @param fxmlFile The name of the FXML file (without the .fxml extension)
     * that defines the layout of the new scene.
     * @param fxmlController The controller object associated with the FXML
     * file, used for handling user interactions in the scene.
     */
    public static void switchScene(String fxmlFile, Object fxmlController) {
        try {
            scene.setRoot(loadFXML(fxmlFile, fxmlController));
        } catch (IOException ex) {
            logger.error(ex.getMessage(), ex);
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Loads the FXML file and sets its controller. This method is used
     * internally to load the FXML layout and return a Parent object that
     * represents the root node of the scene.
     *
     * @param fxmlFile The name of the FXML file (without the .fxml extension)
     * to be loaded.
     * @param fxmlController The instance of an FXML controller to be associated
     * with the FXML file.
     *
     * @return The Parent node corresponding to the loaded FXML file, which can
     * be used as the root of a scene.
     *
     * @throws IOException If an error occurs during the loading of the FXML
     * file.
     */
    public static Parent loadFXML(String fxmlFile, Object fxmlController) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/" + fxmlFile + ".fxml"));
        fxmlLoader.setController(fxmlController);
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
