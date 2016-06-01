package ejemplostema9;

import javax.swing.*;

import java.awt.Color;
import java.awt.Container;

//Ejemplo de uso de JPanel como contenedor de componentes.
public class Ventana2 extends JFrame {

    public Ventana2() {
        
        this.setLocation(400, 300);
        this.setSize(300, 200);
        // Creamos un panel contenedor de color rojo
        JPanel panelRojo = new JPanel();
        panelRojo.setBackground(Color.RED);

        // Colocamos el panel en el panel contenedor de la ventana
        //Container contenedor = this.getContentPane(); 
        //contenedor.add(panelRojo);
        //Añadir directamente el componente sobre el JFrame a partir de 1.5
        this.add(panelRojo);
        //creamos una etiqueta y la añadimos a la ventana
        JLabel etiqueta = new JLabel("Nueva etiqueta");
        //this.getContentPane().add(etiqueta);	//asi lo añadimos al panel contenedor de la ventana
        panelRojo.add(etiqueta); //asi lo añadimos al panel que hemos creado
        this.setVisible(true); //la hago visible

    }

    //Inicio de la aplicacion
    public static void main(String[] args) {
        Ventana2 v = new Ventana2();
      

       
    }
}
