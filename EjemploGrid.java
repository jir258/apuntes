/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author rutfern
 */
public class EjemploGrid extends JFrame {

    public EjemploGrid() {
        super("Ejemplo de GridLayout");
        setLayout(new GridLayout(4, 3, 5, 5));
        for (int i = 1; i <= 10; i++) {
            add(new JButton(Integer.toString(i)));
        }
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        EjemploGrid aplicacion = new EjemploGrid();
    }
}
