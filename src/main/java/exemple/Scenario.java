/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author Juju Vilas
 */
public class Scenario {
    
    Bandeau monBandeau;

    public Scenario(Bandeau monBandeau) {
        this.monBandeau = monBandeau;
    }
    
    public void scenario(Rotation rot, Zoom zoom, Clignotant cli, Rainbow rai){
        // On zoome 
        zoom.zoom(2);
        // On fait clognoter le texte en bleu et rose
        cli.clignote(Color.BLUE,Color.PINK);
        // On fait faire un tour complet au texte
        rot.rotate();
        // On change aléatoirement la couleur du texte parmi 7 couleurs
        rai.rainbow();
        monBandeau.close();
        
    }
    
}
