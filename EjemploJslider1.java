/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplostema9;

/**
 *
 * @author profesor
 */

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class EjemploJslider1 {
  public static void main(String args[]) {
    JFrame frame = new JFrame("Tick Slider");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JSlider oneJSlider = new JSlider();
    oneJSlider.putClientProperty("JSlider.isFilled", Boolean.TRUE);
    JSlider anotherJSlider = new JSlider();
    // Set to default setting
    anotherJSlider.putClientProperty("JSlider.isFilled", Boolean.FALSE);

    frame.add(oneJSlider, BorderLayout.NORTH);
    frame.add(anotherJSlider, BorderLayout.SOUTH);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}
