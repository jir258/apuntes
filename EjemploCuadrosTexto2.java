package ejemplostema9;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

// En este ejemplo ubicamos cada control proporcionando sus coordenadas
// para ello no ponemos ning�n administrador de dise�o al JFrame 
// con la l�nea de c�digo: getContentPane().setLayout(null); 
// y desp�es ubicamos cada control

public class EjemploCuadrosTexto2 implements ActionListener{

	//Componentes
	JFrame marco;
	JLabel l1,l2,l3,l4;
	JTextField nom, apell, edad;
	JPasswordField passwd;
	JButton boton;
	
	public EjemploCuadrosTexto2(){
		
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
		
		l4=new JLabel("Contrase�a:");
		l4.setBounds(40,120, 80, 16);
		l4.setHorizontalAlignment(SwingConstants.LEFT);
		
		passwd=new JPasswordField("",10);
		passwd.setBounds(130, 120, 80, 20);
		passwd.setHorizontalAlignment(SwingConstants.LEFT);
				
		boton=new JButton("Aceptar");
		boton.setBounds(160, 180, 80, 20);
		boton.addActionListener(this);  //genera eventos ActionEvent
	}
	public void distribuirComponentes(){
			
		marco.getContentPane().add(l1);
		marco.getContentPane().add(nom);
		marco.getContentPane().add(l2);
		marco.getContentPane().add(apell);
		marco.getContentPane().add(l3);
		marco.getContentPane().add(edad);
		marco.getContentPane().add(l4);
		marco.getContentPane().add(passwd);
		marco.getContentPane().add(boton);
		
		marco.pack(); 
		marco.setSize(400, 300);
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize(); //obtenemos el tama�o de la pantalla
	        marco.setLocation((screenSize.width-400)/2,(screenSize.height-300)/2); 		//para ubicarla en el centro
		marco.setResizable(false);  //no dejamos cambiar el tama�o de la ventana
		marco.setVisible(true);

	}
	
	public void limpiar(){
		nom.setText("");
		apell.setText("");
		edad.setText("");
		passwd.setText("");
	}
	
	public void actionPerformed(ActionEvent e){
		//se ha pulsado el bot�n Aceptar
		boolean correcto=true;
		
		if (Integer.parseInt(edad.getText())<=0) { //si la edad es nula o negativa
			JOptionPane.showMessageDialog(null, "La edad no puede ser nula o negativa", "Error", JOptionPane.ERROR_MESSAGE);
			//remarcamos el valor de la edad
			edad.setSelectionColor(Color.GRAY);
                        edad.selectAll();
			//la damos el foco
			edad.requestFocus();
			correcto=false;
		}
		
		if (passwd.getPassword().length<6){
			JOptionPane.showMessageDialog(null, "La contraseña debe tener como mínimo 6 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
			//remarcamos el valor de la cotraseña
			passwd.setSelectionColor(Color.GRAY);
                        passwd.selectAll();
                   
			//la damos el foco
			passwd.requestFocus();
			correcto=false;
		}else{
			String resp=JOptionPane.showInputDialog(passwd,"Confirma la contraseña");
                       
			
			String p=String.valueOf(passwd.getPassword());
			if (p.compareTo(resp)!=0) {
				JOptionPane.showMessageDialog(null, "No hay coincidencia", "Aviso", JOptionPane.WARNING_MESSAGE);
				//remarcamos el valor de la edad
				passwd.setSelectionColor(Color.GRAY);
                                passwd.selectAll();
				
				//la damos el foco
				passwd.requestFocus();
				correcto=false;
			}
			else correcto=true;
		}
		
		if(correcto){
			
			//datos válidos: les imprimimos en la consola
			System.out.println(nom.getText());
			System.out.println(apell.getText());
			System.out.println(edad.getText());
			System.out.println(passwd.getPassword());
			limpiar();
		}
		
	}
		
	public static void main(String[] args){
		EjemploCuadrosTexto2 v=new EjemploCuadrosTexto2();
	}

	

}
