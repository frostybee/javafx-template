# JavaFX Project Template

This is a non-modular, Gradle-based project skeleton for creating JavaFX applications.

It uses `JavaFX 20.0.2`, and includes the [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html) (no need to install Gradle locally).

## Features

- JavaFX-aware coding assistance (code completion, search, navigation in JavaFX-specific source files)
- Logging with [Logback](https://logback.qos.ch/).
- Support for FXML.
- Access to JavaFX's JavaDoc from within your IDE.

## How Do I Use this Project Template

1. Download this repository as `.zip` file.
2. Unzip the downloaded `javafx-template-main.zip` file.
3. Add the extracted files to your GitHub repo (if you already have one)
4. Open the project with NetBeans
5. Using NetBeans, build the project to download/resolve the dependencies
6. Change the project name in `settings.gradle`
7. Rename the default Java package `edu.vanier.template` to `edu.vanier.projectname` in `MainApp.java` and `MainAppFXMLController.java`.
8. Change the value of the `mainClass` class property in `build.gradle`. A fully-qualified name of the class containing the main method that you want to run must be supplied.

## How Do I Run Multiple Main Classes?

If you have a project that contains multiple `main` methods, then  you need to change the value of the `mainClass` property in the `build.gradle` file. The fully-qualified name of the class that contains the main method to be executed  must be specified.

The `mainClass` property is declared in the application section (shown below). Note that `//` can be used for inserting a comment line.

```gradle
application {
   mainClass = 'edu.vanier.template.MainApp'
   //mainClass = 'edu.vanier.tests.Driver'
}
```

## NetBeans

This project template was tested with `NetBeans 17` and `JDK 18`.
