package edu.vanier.template.ui;

import edu.vanier.template.controllers.MainAppFXMLController;
import edu.vanier.template.controllers.SceneController;
import edu.vanier.template.controllers.SecondaryFXMLController;
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

    // The FXML file name of the primary scene.
    public static final String MAINAPP_SCENE = "MainApp_layout";
    // The FXML file name of the secondary scene.
    public static final String SECONDARY_SCENE = "secondary_layout";
    //TODO: declare 
    private final static Logger logger = LoggerFactory.getLogger(MainApp.class);
    private static Scene scene;
    private static SceneController sceneController;

    @Override
    public void stop() {
        // TODO: 
        // Here, we need to perform teardown operations such as stopping running 
        // animation, etc.
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            logger.info("Bootstrapping the application...");
            // Load the scene of the primary stage.
            Parent root = loadFXML(MAINAPP_SCENE, new MainAppFXMLController());
            scene = new Scene(root, 640, 480);
            sceneController = new SceneController(scene);
            sceneController.addScene(MAINAPP_SCENE, root);
            primaryStage.setScene(scene);
            primaryStage.sizeToScene();
            // Request putting this appliation's main window on top of other 
            // already-opened windows upon launching t he app.
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
     * @param fxmlFileName The name of the FXML file (without the .fxml
     * extension) that defines the layout of the scene to be loaded.
     */
    //public static void switchScene(String fxmlFile, Object fxmlController) {
    public static void switchScene(String fxmlFileName) {
        try {
            if (fxmlFileName.equals(MAINAPP_SCENE)) {
                // No need to register the primary scene as it 
                // was already done in the start method.                
                sceneController.activateScene(fxmlFileName);

            } else if (fxmlFileName.equals(SECONDARY_SCENE)) {
                if (!sceneController.sceneExists(fxmlFileName)) {
                    // Instantiate the corresponding FXML controller if the 
                    // specified scene is being loaded for the frist time.
                    SecondaryFXMLController controller = new SecondaryFXMLController();
                    Parent root = loadFXML(fxmlFileName, controller);
                    sceneController.addScene(SECONDARY_SCENE, root);
                }
                // The scene has been previously added, we active it.
                sceneController.activateScene(fxmlFileName);
            }
        } catch (IOException ex) {
            logger.error(ex.getMessage(), ex);
        }
    }

    /**
     * Loads the specified FXML file and sets its supplied FXML controller.
     *
     * @param fxmFileName The name of the FXML file (without the .fxml extension)
     * to be loaded.
     * @param fxmlController The instance of an FXML controller to be associated
     * with the FXML file.
     * @return The Parent node corresponding to the loaded FXML file, which can
     * be used as the root of a scene.
     * @throws IOException If an error occurs during the loading of the FXML
     * file.
     */
    public static Parent loadFXML(String fxmFileName, Object fxmlController) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/" + fxmFileName + ".fxml"));
        fxmlLoader.setController(fxmlController);
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
