/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author CREYES
 */
public class CapituloE513 extends JFrame implements ActionListener {
    
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args){
        CapituloE513 marco = new CapituloE513();
        marco.setSize(500 , 400);
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        button = new JButton("Haz clic");
        ventana.add(button);
        button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       double cantidad = 50, 
              interes = 1.5;
       
       double inversion = this.resultadoCincoAnios(cantidad,interes);
       JOptionPane.showMessageDialog(null,"La cantidad despues de 5 años es: " + inversion);
       
    }

    private double resultadoCincoAnios(double cantidad, double interes) {
        double cantidad2, cantidad3, cantidad4, cantidad5;
        
        cantidad  = cantidad  * ( 1 + interes / 100);
        cantidad2 = cantidad  * ( 1 + interes / 100); 
        cantidad3 = cantidad2 * ( 1 + interes / 100); 
        cantidad4 = cantidad3 * ( 1 + interes / 100);
        cantidad5 = cantidad4 * ( 1 + interes / 100);
        
        return cantidad5;
    }


    
}
