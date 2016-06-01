/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author rutfern
 */
public class EjemploBorder  extends JFrame {
public EjemploBorder() { 
    super("Ejemplo de BorderLayout");
 // BorderLayout
setLayout(new BorderLayout(5, 10)); 
add(new JButton("1"), BorderLayout.EAST); 
add(new JButton("2"), BorderLayout.SOUTH); 
add(new JButton("3"), BorderLayout.WEST); 
add(new JButton("4"), BorderLayout.NORTH); 
add(new JButton("5"), BorderLayout.CENTER);
setSize(200,200);
 
setVisible(true); 
setDefaultCloseOperation(EXIT_ON_CLOSE); 
} 
   public static void main(String args[]) {
        EjemploBorder aplicacion = new EjemploBorder();
    }  
}
