/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import static java.lang.Boolean.TRUE;

/**
 *
 * @author Juju Vilas
 */
public class Clignotant extends Effet{
    
    Color couleur1;   
    Color couleur2;  

    public Clignotant(Bandeau monBandeau) {
        super(monBandeau);
    }

    public void clignote(Color couleur1, Color couleur2) {
        boolean b = TRUE;
        for (int i = 0; i < 10; i++) {
            if (b == TRUE) {
                monBandeau.setForeground(couleur1);
                monBandeau.sleep(1000);
                i++;
                b = !b;
            } else {
                monBandeau.setForeground(couleur2);
                monBandeau.sleep(1000);
                i++;
                b = !b;
            }
        }
    }
    
}
