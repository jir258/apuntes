/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

/**
 *
 * @author rutfern
 */
import java.awt.Dimension;
import javax.swing.*;

public class EjemploEtiquetas2 extends JFrame {

    public EjemploEtiquetas2() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();

        JLabel textoHTML = new JLabel("<html>"
                + "<font color='Red' size='7' face='Arial,Helvetica,"
                + "sans-serif'>Este es el texto</font>");
        JLabel grafica1 = new JLabel(new ImageIcon("Imagenes/logo_java.jpg"));
        JLabel grafica2 = new JLabel(new ImageIcon("Imagenes/logo_eclipse.jpg"));
        panel.add(textoHTML);
        panel.add(grafica1);
        panel.add(grafica2);
        
        this.getContentPane().add(panel);
        this.setPreferredSize(new Dimension(300, 300));
        this.pack();        
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EjemploEtiquetas2 ej=new EjemploEtiquetas2();
        ej.setVisible(true);
    }
}

