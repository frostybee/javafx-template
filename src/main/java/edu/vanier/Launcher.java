package edu.vanier;

import edu.vanier.template.*;
import edu.vanier.template.tests.*;

/**
 * The Launcher class serves as the entry point to the application.
 *
 * Currently, it launches the {@link MainApp} class's main method to start the
 * application. A commented-out line suggests the potential to launch another
 * class (e.g., {@link Driver}) in the future.
 */
public class Launcher {

    /**
     * The entry point of the application that invokes the
     * {@link MainApp#main(String[])} method to start the FX main application.
     *
     * @param args Command-line arguments passed to the application. These are
     * forwarded to {@link MainApp#main(String[])}.
     */
    public static void main(String[] args) {
        //TODO: Here you can add in the form of [ClassName].main(args);
        // NOTE: You can run multiple main methods Once main method at time should be executed.

        // Comment out the following line if you would like to run execute another 
        // main method.
        MainApp.main(args);

        // Uncomment the following line to run the Driver's main.
        //Driver.main(args);        
    }
}
