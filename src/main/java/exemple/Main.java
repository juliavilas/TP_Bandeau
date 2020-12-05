/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author Juju Vilas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bandeau monBandeau = new Bandeau();
        
        monBandeau.setMessage("Bienvenue");
        monBandeau.sleep(1000);
        
        Rotation rot = new Rotation(monBandeau);
        Zoom zoom = new Zoom(monBandeau);
        Clignotant cli = new Clignotant(monBandeau);
        Rainbow rai = new Rainbow(monBandeau);

        Scenario sce = new Scenario(monBandeau);
        sce.scenario(rot, zoom, cli,rai);
    }
    
}
