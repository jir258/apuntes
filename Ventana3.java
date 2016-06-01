/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

import javax.swing.JDialog;

/**
 *
 * @author rutfern
 */
public class Ventana3 extends JDialog {
    
    public Ventana3() {
        this.setTitle("Hola mundo2");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

    //Inicio de la aplicacion
    public static void main(String[] args) {
        
        Ventana3 v = new Ventana3();
        
    }
}
