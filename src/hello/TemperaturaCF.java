/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author CREYES
 */
public class TemperaturaCF extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        TemperaturaCF marco = new TemperaturaCF();
        marco.setSize(400, 300);
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        botón = new JButton("Haga clic");
        ventana.add(botón);
        botón.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
      int f , c;
      
      f = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la temperatura en Fahrenheit"));
      c = ( f - 32 ) * 5 / 9;
      
      JOptionPane.showMessageDialog(null, f + "°F es igual a " + c + "°C");
      
        
    }

    
}
