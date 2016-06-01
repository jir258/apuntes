/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rutfern
 */
public class EjemploPaneles extends JFrame {

    public EjemploPaneles() {
        super("Ejemplo paneles");
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        //this.pack();
        JPanel etiqueta = new JPanel(new FlowLayout()); 
        etiqueta.add(new JLabel("Dirección"));
        etiqueta.add(new JTextField("Calle y número"));
        etiqueta.setBackground(Color.yellow);
        
        
        JPanel caja = new JPanel(new BorderLayout());
        caja.add(etiqueta, BorderLayout.NORTH);
        caja.add(new JButton("Aceptar"),BorderLayout.SOUTH);
        
        this.add(caja);
        this.setVisible(true);

    }

    public static void main(String args[]) {
        EjemploPaneles aplicacion = new EjemploPaneles();
    }
}
