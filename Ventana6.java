/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

import com.sun.glass.ui.Cursor;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author profesor
 */
public class Ventana6 {

     public static void main(String args[]) {
        JFrame frame = new JFrame("Ejemplo 01");
        JButton miboton = new JButton("Aceptar");
        miboton.setCursor(java.awt.Cursor.getPredefinedCursor(Cursor.CURSOR_OPEN_HAND));
        frame.add(miboton); //se añade al frame
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
