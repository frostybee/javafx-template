# JavaFX Project Template

This is a non-modular, Gradle-based project skeleton for creating JavaFX applications.

It uses `JavaFX 20.0.2`, and includes the [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html) (no need to install Gradle locally).

## Features

- JavaFX-aware coding assistance (code completion, search, navigation in JavaFX-specific source files)
- Logging with [Logback](https://logback.qos.ch/).
- Support for FXML.
- Access to JavaFX's JavaDoc from within your IDE.

## Using this Project Template

1. Clone this repository
2. Remove the `.git` directory 
3. Add the cloned directory structure to your local repo (if you already have one)
4. Open the project with NetBeans
5. Using NetBeans, build the project to resolve the dependencies
6. Change the project name in `settings.gradle`
7. Rename the default Java package in `MainApp.java` and `MainAppController.java`.
8. Change the value of the `mainClass` class property in `build.gradle`. A fully-qualified name of the class containing the main method that you want to run must be supplied.

## NetBeans

This project template was tested with `NetBeans 17` and `JDK 18`.
