package fr.univ_amu.iut.exercice4;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MySecondJavaFXWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Second Useless JavaFX Window");
        stage.setHeight(400);
        stage.setWidth(800);
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.show();
    }

}
