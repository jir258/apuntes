/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author rutfern
 */
public class EjemploHorno extends JFrame {

    public EjemploHorno() {
        setTitle("Horno microondas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        // Crear  panel p1 para los botones y la matriz de números 
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));
        // Add buttons to the panel
        for (int i = 1; i <= 9; i++) {
            p1.add(new JButton("" + i));
        }
        p1.add(new JButton("" + 0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));

        // crear panel p2 para colocar p1 y la caja de texto
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(new JTextField("Tiempo"), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);
        // Añadir p2  y un boton en el frame 
        add(p2, BorderLayout.EAST);
        add(new Button("Comida"), BorderLayout.CENTER);
        setSize(400, 200);
        setVisible(true);
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        EjemploHorno frame = new EjemploHorno();
    }
}
