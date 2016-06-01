package ejemplostema9;
import java.awt.*;


import javax.swing.*;

public class EjemploBag2 {

	JFrame ventana;
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JButton boton5;
	JButton boton6;
	GridBagConstraints restricciones;
	
	public EjemploBag2(){
		ventana=new JFrame("Ejemplo GridBagLayout2");
		ventana.setSize(300, 200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(new GridBagLayout());
		restricciones=new GridBagConstraints();
		restricciones.fill=GridBagConstraints.BOTH; 
		restricciones.weightx=1.0;  
		restricciones.weighty=1.0;
			
		restricciones.gridwidth=2; //doble anchura
		anadeGrid(new JButton("Uno"),0,0);
		
		restricciones.gridwidth=1;
		anadeGrid(new JButton("Dos"),2,0);
		
		restricciones.gridwidth=1;
		anadeGrid(new JButton("Tres"),3,0);
		
		restricciones.gridheight=2; //doble altura
		anadeGrid(new JButton("Cuatro"),0,1);
		
		restricciones.gridheight=1;
		restricciones.gridwidth=2; //doble anchura
		anadeGrid(new JButton("Cinco"),2,1);
		
		restricciones.gridheight=1;
		restricciones.gridwidth=2; //doble anchura
		anadeGrid(new JButton("Seis"),2,2);
		
		ventana.setVisible(true);
		
	}
		
	private void anadeGrid(Component c, int x, int y){  //m�todo para colocar un componente en una poscion (x,y)
		restricciones.gridx=x;
		restricciones.gridy=y;
		ventana.getContentPane().add(c,restricciones); //a�adimos el componente con sus restricciones
	}

	
	
	public static void main(String[] args) {
		EjemploBag2 ej=new EjemploBag2();
	}

}
