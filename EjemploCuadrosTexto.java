package ejemplostema9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// En este ejemplo ubicamos cada control proporcionando sus coordenadas
// para ello no ponemos ning�n administrador de dise�o al JFrame 
// con la l�nea de c�digo: getContentPane().setLayout(null); 
// y desp�es ubicamos cada control

public class EjemploCuadrosTexto implements ActionListener{

	//Componentes
	JFrame marco;
	JLabel l1,l2,l3,l4;
	JTextField nom, apell, edad;
	JPasswordField passwd;
	JButton boton;
	
	public EjemploCuadrosTexto(){
		
		configurarComponentes();	
		distribuirComponentes();
	}
		
	public void configurarComponentes(){
		//Creamos y configuramos los componentes
		marco=new JFrame("Datos personales");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.getContentPane().setLayout(null);  
						
		l1=new JLabel("Nombre:");
		l1.setBounds(40,30, 80, 16);
		l1.setHorizontalAlignment(SwingConstants.LEFT);
		
		nom=new JTextField("",20);
		nom.setBounds(130, 30, 200, 20);
		nom.setHorizontalAlignment(SwingConstants.LEFT);
		
		l2=new JLabel("Apellidos:");
		l2.setBounds(40,60, 80, 16);
		l2.setHorizontalAlignment(SwingConstants.LEFT);
		
		apell=new JTextField("",30);
		apell.setBounds(130, 60, 250, 20);
		apell.setHorizontalAlignment(SwingConstants.LEFT);
		
		l3=new JLabel("Edad:");
		l3.setBounds(40,90, 80, 16);
		l3.setHorizontalAlignment(SwingConstants.LEFT);
              
		
		edad=new JTextField("",2);
		edad.setBounds(130, 90, 30, 20);
		edad.setHorizontalAlignment(SwingConstants.LEFT);
		edad.setToolTipText("La edad no puede ser nula o negativa");
                
		l4=new JLabel("Contraseña:");
		l4.setBounds(40,120, 80, 16);
		l4.setHorizontalAlignment(SwingConstants.LEFT);
              
		
		passwd=new JPasswordField("",6);
		passwd.setBounds(130, 120, 80, 20);
		passwd.setHorizontalAlignment(SwingConstants.LEFT);
                passwd.setToolTipText("La contraseña debe tener como mínimo 6 caracteres");
		
		boton=new JButton("Aceptar");
		boton.setBounds(160, 180, 80, 20);
		boton.addActionListener(this);
	}
	public void distribuirComponentes(){
			
		marco.add(l1);
		marco.add(nom);
		marco.add(l2);
		marco.add(apell);
		marco.add(l3);
		marco.add(edad);
		marco.add(l4);
		marco.add(passwd);
		marco.add(boton);
		
		marco.pack(); 
		marco.setSize(400, 300);
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize(); //obtenemos el tamaño de la pantalla
	        marco.setLocation((screenSize.width-400)/2,(screenSize.height-300)/2); 		//para ubicarla en el centro
                marco.setResizable(false);  //no dejamos cambiar el tamaño de la ventana
		marco.setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e){
		//se ha pulsado el bot�n Aceptar
		System.out.println(nom.getText());
		System.out.println(apell.getText());
		System.out.println(edad.getText());
		System.out.println(passwd.getPassword());
		
	}
	
	public static void main(String[] args){
		EjemploCuadrosTexto v=new EjemploCuadrosTexto();
	}

}
