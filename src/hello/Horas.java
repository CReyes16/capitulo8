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
public class Horas extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        Horas marco = new Horas();
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
      
      final int dividirMinuto = 60;
      final int dividirSegundo = 3600;
      double hora; 
      int minuto, numeroEntrada;
      numeroEntrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa los segundos"));
      
      minuto = numeroEntrada / dividirMinuto;
      hora   = numeroEntrada / dividirSegundo;
      
      
      JOptionPane.showMessageDialog(null,"Hora: " + hora +  " Minuto: " + minuto + " Segundo: " + numeroEntrada);
      
        
    }

    
}
