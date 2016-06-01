/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;


/**
 *
 * @author rutfern
 */

   
public class Ventana4 extends JApplet {
    @Override
    public void init(){
        this.setBackground(Color.red);
    }
    @Override
    public void paint(Graphics g){
        g.drawString("Primer applet", 10, 10);
        
    }
}
    

