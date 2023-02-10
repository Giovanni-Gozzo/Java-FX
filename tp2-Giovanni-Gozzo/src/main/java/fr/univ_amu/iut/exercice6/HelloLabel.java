package fr.univ_amu.iut.exercice6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloLabel extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
/*Le titre de la fenêtre principale doit être "Hello !"
Le Stage doit contenir une Scene de largeur 250 et de hauteur 100
Le graphe de cette scène doit avoir pour racine un nœud du type BorderPane
Au centre de ce BorderPane, placez un Label (voir la documentation de cette classe) ayant pour text la chaîne Hello !
Ce label doit avoir pour Id la valeur "labelHello" (attention, sans #) ; ici encore, vous pouvez utiliser un setter
La fenêtre doit être visible*/
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello !");
        BorderPane root = new BorderPane();
        Label label = new Label("Hello !");
        label.setId("labelHello");
        root.setCenter(label);
        Scene scene = new Scene(root, 250, 100);
        primaryStage.setScene(scene);
        primaryStage.setHeight(100);
        primaryStage.show();
    }
}
