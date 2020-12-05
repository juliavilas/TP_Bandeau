/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Juju Vilas
 */
public class Rainbow extends Effet{
    
    public Rainbow(Bandeau monBandeau) {
        super(monBandeau);
    }

    public void rainbow() {
        for (int i = 0; i <= 7; i++) {
            Random random = new Random();
            int c = 0;
            c = random.nextInt(7);
            switch (c) {
                case 0:
                    monBandeau.setForeground(Color.PINK);
                    monBandeau.sleep(1000);

                    break;
                case 1:
                    monBandeau.setForeground(Color.BLUE);
                    monBandeau.sleep(1000);

                    break;
                case 2:
                    monBandeau.setForeground(Color.CYAN);
                    monBandeau.sleep(1000);
                    break;
                case 3:
                    monBandeau.setForeground(Color.GREEN);
                    monBandeau.sleep(1000);
                    break;
                case 4:
                    monBandeau.setForeground(Color.YELLOW);
                    monBandeau.sleep(1000);
                    break;
                case 5:
                    monBandeau.setForeground(Color.ORANGE);
                    monBandeau.sleep(1000);
                    break;
                case 6:
                    monBandeau.setForeground(Color.RED);
                    monBandeau.sleep(1000);
                    break;

            }
        }
    }
    
}
