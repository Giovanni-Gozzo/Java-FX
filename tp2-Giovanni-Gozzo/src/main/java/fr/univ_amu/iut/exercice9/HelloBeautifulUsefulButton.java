package fr.univ_amu.iut.exercice9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class HelloBeautifulUsefulButton extends Application {
    /*La classe EcouteurSimple doit implémenter l'interface EventHandler<ActionEvent>
    La méthode handle() de cette classe se contente d'afficher le texte "Bouton actionné" sur la sortie standard.
    La classe HelloBeautifulUsefulButton doit respecter les même contraintes que HelloBeautifulButton.
    Le bouton doit ajouter une instance de la classe EcouteurSimple comme écouteur
    Rendre visible la fenêtre*/
    @Override
    public void start(Stage primaryStage) throws Exception {
primaryStage.setTitle("Hello World");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(EcouteurSimple::handle);
        BorderPane root = new BorderPane();
        root.setCenter(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
