package ç;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class EjemploOpciones1 implements ItemListener{
	
	JFrame ventana;
	JCheckBox trabaja;
	JCheckBox estudia;
	JLabel msg;
	
	//variables que controlan que opci�n/es se han marcado
	boolean estudiar=false;
	boolean trabajar=false;
	
	public EjemploOpciones1(){
		ventana=new JFrame("Opciones");
		ventana.setSize(250, 150);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(new FlowLayout());
		centrarVentana();
		
		JPanel panel=new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("¿A qué te dedicas?"));
		trabaja=new JCheckBox("Trabajo");
		estudia=new JCheckBox("Estudio");
		msg=new JLabel();
		
		trabaja.addItemListener(this);	
		estudia.addItemListener(this);
		
		panel.add(estudia);
		panel.add(trabaja);
		ventana.getContentPane().add(panel);
		ventana.getContentPane().add(msg);
		
		ventana.setVisible(true);
		
	}

	public void centrarVentana() {
		
		ventana.setResizable(false);	//fijamos el marco de la ventana, ya no podra ser ampliada
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		ventana.setLocation((screenSize.width - ventana.getWidth()) / 2, (screenSize.height - ventana.getHeight()) / 2);
	}
	
	public static void main(String[] args){
		EjemploOpciones1 ej=new EjemploOpciones1();
	}

	public void itemStateChanged(ItemEvent arg0) {
				
		if(arg0.getItemSelectable()==trabaja){ //si ha provocado el evento la casilla "Trabajo"
			//miramos si se ha seleccionado
			if(arg0.getStateChange()==ItemEvent.SELECTED){
				trabajar=true;
			}else{
				trabajar=false;
			}
		}else{ //ha provocado el evento la casilla "Estudio"
			if(arg0.getStateChange()==ItemEvent.SELECTED){
				estudiar=true;
			}else{
				estudiar=false;
			}
		}
		
		if(estudiar && trabajar) msg.setText("Tu ocupación es estudiar y trabajar");
		else if(estudiar && !trabajar) msg.setText("Tu ocupación es estudiar");
		else if(!estudiar && trabajar) msg.setText("Tu ocupación es trabajar");
		else msg.setText("Eres un vago!!");
		
	}

	
}
