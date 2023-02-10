package fr.univ_amu.iut.exercice2;

import javafx.application.Application;
import javafx.stage.Stage;

public class ApplicationLifeCycle extends Application {

    public ApplicationLifeCycle() {
    }

    public static void main(String[] args) {
        System.out.println("main: avant laucnh");
        launch(args);
        System.out.println("main: aprés laucnh");
    }

    @Override
    public void init() throws Exception {
        System.out.println("init()");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop()");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Application Life Cycle");
        System.out.println("start() : avant show stage");
        primaryStage.show();
        System.out.println("start() : aprés show stage");
    }
}
