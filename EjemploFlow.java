package ejemplostema9;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rutfern
 */
public class EjemploFlow extends JFrame {

    public EjemploFlow() {
        super("Ejemplo de FlowLayout");
 
        // Configurar layout ; 
        this.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));
        for (int i = 1; i <= 20; i++) {
            add(new JButton("Componente " + i));
        }
        setSize(200, 200);
        //pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        EjemploFlow aplicacion = new EjemploFlow();
    }

}
