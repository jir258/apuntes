package ejemplostema9;
import java.awt.BorderLayout;
import javax.swing.*;

public class EjemploJScrollPane {
	
	JFrame ventana;
	JTextArea area;
	JScrollPane barra;
	
	public EjemploJScrollPane(){
		
		ventana=new JFrame("Barra de desplazamiento");
		ventana.setSize(100,100);
		ventana.setLayout(new BorderLayout());
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//colocamos una barra de desplazamiento vertical al area de texto
		area=new JTextArea();
		//indicamos que la barra es para el �rea de texto, e indicamos
		//cuando mostrar las barras vertical y horizonta.
		barra=new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		//a�adimos la barra a la ventana (el panel ya contiene al �rea de texto)
		ventana.getContentPane().add(barra, BorderLayout.CENTER);
		ventana.setVisible(true);
		
		
	}
	
	public static void main(String[] args){
		EjemploJScrollPane ej=new EjemploJScrollPane();
	}

}
