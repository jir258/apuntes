/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author profesor
 */

//Invocando el evento en la propia ventana
public class EjemploListener extends JFrame implements MouseListener {

    public JLabel label;
    public JTextField caja;

    //constructor de la ventana
    public EjemploListener() {

        //ponemos un título a la ventana
        this.setTitle("Ejemplo Listener");

        //la damos un layout
        this.setLayout(new FlowLayout());

        //creación de los controles
        label = new JLabel("Etiqueta");
        caja = new JTextField("Relleno etiqueta");

        //capacitamos al control para lanzar eventos de ratón
        //e indicamos que el listener es la propia ventana (JFrame)
        caja.addMouseListener(this);

        //añadimos los controles a la ventana
        this.add(label);
        this.add(caja);

        this.setVisible(true);
        this.pack();
    }

    //Métodos de la interfaz MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clic con el ratón");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    //Inicio de la aplicacion
    public static void main(String[] args) {
        EjemploListener v = new EjemploListener();
    }

}
