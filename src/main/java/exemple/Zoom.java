/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author Juju Vilas
 */
public class Zoom extends Effet{
    
    public Zoom(Bandeau monBandeau) {
        super(monBandeau);
    }
    
    public void zoom(int indiceZoom){
        if(indiceZoom <=1){
            throw new IllegalArgumentException("Le multiplicateur doit être supérieur à 1");
        }
        int nouvelleTaille = indiceZoom*monBandeau.getFont().getSize();
        for(int i = monBandeau.getFont().getSize(); i< nouvelleTaille; i+=5){
            Font f = new Font("Dialog", Font.BOLD, 5+i);
            monBandeau.setFont(f);
            monBandeau.sleep(100);
        }
    }
    
}
