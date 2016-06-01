/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostema9;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rutfern
 *
 * Versión del Ejercicio1 con clase Adapter
 *
 */
public class Ejercicio12_Listener extends javax.swing.JFrame {

    private JPanel panel;
    private JTextField caja1;
    private JTextField caja2;
    private JLabel etiqueta;

    public Ejercicio12_Listener() {
        initComponents();
        crearComponentes();
    }

    private void crearComponentes() {

        setTitle("Eventos de foco");
        getContentPane().setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new BoxLayout(panel, javax.swing.BoxLayout.PAGE_AXIS));

        caja1 = new JTextField();
        caja1.setActionCommand("caja1");
        caja2 = new JTextField();
        caja1.setActionCommand("caja2");
        etiqueta = new JLabel();
        etiqueta.setHorizontalAlignment((int) JLabel.CENTER_ALIGNMENT);

        //asigno listener a las cajas
        caja1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e){
                etiqueta.setText("Dentro caja1");
            }
        });
        caja2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e){
                etiqueta.setText("Dentro caja2");
            }
        });
        
        //meto los componentes en su contenedor
        panel.add(caja1);
        panel.add(caja2);
        panel.add(etiqueta);        
        getContentPane().add(panel);
        
        //doy a la ventana tamaño preferido y mínimo preferido 
        //para que no se pueda hacer más pequeña de ese mínimo
        this.setMinimumSize(new Dimension(250, 150));
        this.setPreferredSize(new Dimension(250, 150));

        //para que la etiqueta se redimensione automáticamente
        this.etiqueta.setMinimumSize(new Dimension(250, 20));
        this.etiqueta.setMaximumSize(new Dimension(this.getMaximumSize().width, 20));
        this.etiqueta.setPreferredSize(new Dimension(250, 20));
        this.pack();

        //centro la ventana
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio12_Listener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio12_Listener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio12_Listener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio12_Listener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio12_Listener().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}