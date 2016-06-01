/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author profesor
 */

//Con listener en otro objeto
public class EjemploListener1 extends JFrame  {

    public JLabel label;
    public JTextField caja;

    //constructor de la ventana
    public EjemploListener1() {

        //ponemos un título a la ventana
        this.setTitle("Ejemplo Listener");

        //la damos un layout
        this.setLayout(new FlowLayout());

        //creación de los controles
        label = new JLabel("Etiqueta");
        caja = new JTextField("Relleno etiqueta");

        //capacitamos al control para lanzar eventos de ratón
        //e indicamos que el listener es la propia ventana (JFrame)
        Listener1 l = new Listener1(this);
        caja.addMouseListener(l);

        //añadimos los controles a la ventana
        this.add(label);
        this.add(caja);

        this.setVisible(true);
        this.pack();
    }

  

    //Inicio de la aplicacion
    public static void main(String[] args) {
        EjemploListener1 v = new EjemploListener1();
    }

}
