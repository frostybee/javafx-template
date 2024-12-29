package edu.vanier.template.helpers;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 *
 * @author frostybee
 */
public class FxUIHelper {

    /**
     * Load an FXML file.
     *
     * This method should be used if the FXML controller is specified in the
     * FXML file itself, or the FXML file to be loaded doesn't require a
     * controller.
     *
     * @param fxmFileName The the FXML file name to be loaded (without the .fxml
     * extension).
     * @return The Parent node corresponding to the loaded FXML file, which can
     * be used as the root of a scene.
     * @throws IOException If an error occurs during the loading of the FXML
     * file.
     */
    public static Parent loadFXML(String fxmFileName) throws IOException {
        return loadFXML(fxmFileName, null);
    }

    /**
     * Loads the specified FXML file and sets the supplied FXML controller.
     *
     * @param fxmFileName The the FXML file name to be loaded (without the .fxml
     * extension).
     * @param fxmlController The instance of an FXML controller to be associated
     * with the FXML file.
     * @return The Parent node corresponding to the loaded FXML file, which can
     * be used as the root of a scene.
     * @throws IOException If an error occurs during the loading of the FXML
     * file.
     */
    public static Parent loadFXML(String fxmFileName, Object fxmlController)
            throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                FxUIHelper.class.getResource("/fxml/" + fxmFileName + ".fxml"));
        if (fxmlController != null) {
            fxmlLoader.setController(fxmlController);
        }
        return fxmlLoader.load();
    }
}
