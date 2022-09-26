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
public class CapituloE511 extends JFrame implements ActionListener {
    
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args){
        CapituloE511 marco = new CapituloE511();
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
       
        double radio = 5, altura = 10;
        double areaCilindro = areaCirculo(radio, altura);
        JOptionPane.showMessageDialog(null,"El area del cilindro es: " + areaCilindro);
    }

    private double areaCirculo(double r, double h) {       
        return 2 * Math.PI * r * ( r + h );
    }

    

    
}
