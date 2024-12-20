package edu.vanier;

import edu.vanier.template.ui.MainApp;
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
        //NOTE: This launcher class allows you to run 
        //      multiple main methods simultaneously (depending on the context).         

        //NOTE: Comment out the following line if you would like to execute 
        //      another class  
        MainApp.main(args);
        //--
        // Uncomment the following line to run the Driver's main method.
        //Driver.main(args);        
        //TODO: To run a class' main method, you can add a Java 
        //      statements in the form of:
        // [ClassName].main(args);        
    }
}
