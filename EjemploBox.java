package ejemplostema9;

import javax.swing.*;

public class EjemploBox extends JFrame {
	
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
		
	public EjemploBox(){
		
		setTitle("Prueba BoxLayout");
		setLocation(50, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
		boton1=new JButton("Aceptar");
		boton2=new JButton("Cancelar");
		boton3=new JButton("Pulse aqui");
		boton4=new JButton("Limpiar");
		
		Box b=Box.createHorizontalBox();
		
		b.add(boton1);
		b.add(Box.createHorizontalStrut(200));
		
		b.add(boton2);
		b.add(Box.createHorizontalGlue());
		
		b.add(boton3);
		b.add(Box.createHorizontalGlue());
		
		b.add(boton4);
		
		this.getContentPane().add(b);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		EjemploBox ej=new EjemploBox();
	}

}
