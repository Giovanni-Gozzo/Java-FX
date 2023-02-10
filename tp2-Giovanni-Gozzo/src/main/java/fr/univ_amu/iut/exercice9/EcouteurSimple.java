package fr.univ_amu.iut.exercice9;
import javafx.event.EventHandler;

import java.awt.event.ActionEvent;
    /*La classe EcouteurSimple doit implémenter l'interface EventHandler<ActionEvent>
    La méthode handle() de cette classe se contente d'afficher le texte "Bouton actionné" sur la sortie standard.
*/
public class EcouteurSimple implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Bouton actionné");
    }

}
