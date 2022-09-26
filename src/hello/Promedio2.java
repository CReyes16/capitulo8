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
public class Promedio2 extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        Promedio2 marco = new Promedio2();
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
       double c1 , c2 , c3 , promedio;
       final int CALIFICACIONPARCIAL = 3;
       
       c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu primer calificacion"));
       c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu segunda calificacion"));
       c3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu tercer calificacion"));
       
       promedio = (c1 + c2 + c3)/ CALIFICACIONPARCIAL;
       JOptionPane.showMessageDialog(null,"Tu promedio final es: " + promedio);
    }

    
}
