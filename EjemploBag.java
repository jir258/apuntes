package ejemplostema9;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EjemploBag {

	JFrame ventana;
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;

	GridBagConstraints restricciones;
	
	public EjemploBag(){
		ventana=new JFrame("Ejemplo GridBagLayout");
		ventana.setSize(300, 200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(new GridBagLayout());
		restricciones=new GridBagConstraints();
		
		
		anadeGrid(new JButton("Norte"),1,0);
		anadeGrid(new JButton("Sur"),1,2);
		anadeGrid(new JButton("Este"),2,1);
		anadeGrid(new JButton("Oeste"),0,1);
		anadeGrid(new JButton("Centro"),1,1);
		
		ventana.setVisible(true);
		
	}
		
	private void anadeGrid(Component c, int x, int y){  //m�todo para colocar un componente en una poscion (x,y)
		restricciones.gridx=x;
		restricciones.gridy=y;
		ventana.getContentPane().add(c,restricciones); //a�adimos el componente con sus restricciones
	}

	
	
	public static void main(String[] args) {
		EjemploBag ej=new EjemploBag();
	}

}
