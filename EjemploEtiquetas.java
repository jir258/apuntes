package ejemplostema9;
import java.awt.FlowLayout;
import javax.swing.*;
public class EjemploEtiquetas {

	public static void main(String[] args) {
		JFrame marco=new JFrame();
		JPanel panel=new JPanel();
                panel.setLayout(new FlowLayout());
		
		JLabel textoHTML=new JLabel("<html>"+
				"<font color='Red' size='7' face='Arial,Helvetica,"+
				"sans-serif'>Este es el texto</font>");
		
		panel.add(textoHTML);
		
		marco.setLocation(100,100);
		marco.setSize(300,300);
		marco.add(panel);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

