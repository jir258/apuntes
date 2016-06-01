package ejemplostema9;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EjemploCombo implements ItemListener{

	JFrame ventana;
	JComboBox combo;
	JLabel etiqueta;
	
	public EjemploCombo(){
		
		ventana=new JFrame("Ejemoplo combo");
		ventana.setLayout(new BorderLayout());
		ventana.setSize(300,200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creamos la lista
		String[] animales={"perro","gato","vaca","oveja","cerdo","pollo","cabra","caballo","asno"};
		combo=new JComboBox(animales);
		combo.setMaximumRowCount(5);
		//combo.setEditable(false);
						
		//controlamos la selecci�n de elementos de la lista
		combo.addItemListener(this);
		
		//creamos la etiqueta para mostrar el elemento seleccionado de la lista
		etiqueta=new JLabel("Seleccionado: ");
		
		//paneles auxiliares
		JPanel p1=new JPanel(new FlowLayout());
		JPanel p2=new JPanel(new FlowLayout());

		p1.add(combo);
		p2.add(etiqueta);
		
		//a�adimos los paneles a la ventana
		ventana.getContentPane().add(p1,BorderLayout.CENTER);
		ventana.getContentPane().add(p2,BorderLayout.SOUTH);
		
		ventana.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		EjemploCombo ej=new EjemploCombo();

	}

	public void itemStateChanged(ItemEvent arg0) {
		etiqueta.setText((String)combo.getSelectedItem());
		
	}

}
