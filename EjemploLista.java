package ejemplostema9;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EjemploLista implements ListSelectionListener{

	JFrame ventana;
	JList lista;
	JLabel etiqueta;
	
	public EjemploLista(){
		
		ventana=new JFrame("Ejemoplo lista");
		ventana.setLayout(new BorderLayout());
		ventana.setSize(300,200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creamos la lista
		String[] animales={"perro","gato","vaca","oveja","cerdo","pollo","cabra","caballo","asno"};
		lista=new JList(animales);
		JScrollPane scroll=new JScrollPane(lista); //asignamos a la lista una barra de desplazamiento
		lista.setVisibleRowCount(5); //ponemos 5 filas visibles en la lista
		lista.setFixedCellWidth(100);   //anchura de las celdas de la lista
		lista.setSelectionBackground(Color.PINK);
		//lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  //s�lo se puede elegir un elemento
		
		//controlamos la selecci�n de elementos de la lista
		lista.addListSelectionListener(this);
		
		//creamos la etiqueta para mostrar el elemento seleccionado de la lista
		etiqueta=new JLabel("Seleccionado: ");
		
		//paneles auxiliares
		JPanel p1=new JPanel(new FlowLayout());
		JPanel p2=new JPanel(new FlowLayout());
				
		p1.add(scroll);
		p2.add(etiqueta);
		
		//a�adimos los paneles a la ventana
		ventana.getContentPane().add(p1,BorderLayout.CENTER);
		ventana.getContentPane().add(p2,BorderLayout.SOUTH);
		
		ventana.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		EjemploLista ej=new EjemploLista();

	}

	//m�todo que se ejecuta cuando seleccinamos un elemento de la lista
	public void valueChanged(ListSelectionEvent arg0) {
		String texto="Seleccionado: ";
			
		//recorremos el array de elementos "seleccionados" de la lista
		for(int i=0;i<lista.getSelectedValues().length;i++){
			//a�adimos a la cadena el elemetno seleccionado i-�simo
			texto+=(String) lista.getSelectedValues()[i]+ " ";
		}
		
		etiqueta.setText(texto);
	}

}
