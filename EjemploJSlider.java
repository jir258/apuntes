package ejemplostema9;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EjemploJSlider implements ChangeListener{
	
	JFrame ventana;
	JLabel etiqueta;
	JSlider barra;
	
	public EjemploJSlider() {
		
		ventana=new JFrame("Barra de deslizamiento");
		ventana.setSize(400,100);
		ventana.setLayout(new BorderLayout());
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		etiqueta=new JLabel("Valor: 0");
		etiqueta.setHorizontalAlignment(JLabel.HORIZONTAL);
		
		//creamos el deslizador indicando la orientaci�n, valor min, max y valor inicial
		barra=new JSlider(JSlider.HORIZONTAL,0,100,0);
		//barra.setValue(50);   //podemos ajustar el deslizador en un valor concreto
		
		//configuramos la apariencia del deslizador
		barra.putClientProperty("JSlider.isFilled", Boolean.TRUE);
		barra.setPaintLabels(true);
		barra.setPaintTicks(true);
		barra.setPaintTrack(true);
		barra.setMajorTickSpacing(25);
		barra.setMinorTickSpacing(5);
		//barra.setSnapToTicks(true);
		
		//controlamos el cambio de posici�n del deslizados
		barra.addChangeListener(this);
		
		//a�adimos los controles a la ventana
		ventana.getContentPane().add(barra, BorderLayout.NORTH);
		ventana.getContentPane().add(etiqueta,BorderLayout.SOUTH);
		ventana.setVisible(true);
		
	}
	
	public static void main(String[] args){
		EjemploJSlider ej=new EjemploJSlider();
	}

	public void stateChanged(ChangeEvent e) {
		//obtenemos el valor actual del deslizador y los mostramos en la etiqueta
		etiqueta.setText("Valor: " + ((JSlider)e.getSource()).getValue());
		
	}

}
