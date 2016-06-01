/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplostema9;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author rutfern
 */
public class Listener implements FocusListener {

    private Ejercicio11_Listener gui;
    
    public Listener(Ejercicio11_Listener gui){
        this.gui=gui;
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource()==gui.getCaja1()){
            gui.getEtiqueta().setText("Dentro caja1");
        }else{
            gui.getEtiqueta().setText("Dentro caja2");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        
    }
    
    
    
}
