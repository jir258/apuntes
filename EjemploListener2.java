/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author profesor
 */
// Utilizando un adaptador
public class EjemploListener2 {

    public JLabel label;
    public JTextField caja;

    //Inicio de la aplicacion
    public static void main(String[] args) {

        JFrame jf = new JFrame("Ejemplo Listener");
        //la damos un layout
        jf.setLayout(new FlowLayout());
        //creación de los controles
        JLabel label = new JLabel("Etiqueta");
        JTextField caja = new JTextField("Relleno etiqueta");
        
        caja.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clic con el ratón");
            }
        });
        //añadimos los controles a la ventana
        jf.add(label);
        jf.add(caja);

        jf.setVisible(true);
        jf.pack();
    }

}
