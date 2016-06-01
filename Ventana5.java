/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author rutfern
 */
public class Ventana5 extends JFrame {
   

    private JButton miboton;

    public Ventana5() {
        super("Ejemplo 01 con botón");
// Configurar componentes ;
        miboton = new JButton("Aceptar");
        add(miboton);
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        Ventana5 aplicacion = new Ventana5();

    }
}
