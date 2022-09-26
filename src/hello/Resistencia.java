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
public class Resistencia extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        Resistencia marco = new Resistencia();
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
      
      
      double r1, r2, serie, paralelo;
      
      r1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el valor de R1"));
      r2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el valor de R2"));
      
      serie    = r1 + r2;
      paralelo = (r1 * r2 ) / ( r1 + r2 );
      
      JOptionPane.showMessageDialog(null,
              "Resistencia en serie es: "    + serie + "\n" +
              "Resistencia en paralelo es: " + paralelo);
              
    }

    
}
