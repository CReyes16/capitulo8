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
public class Circulo extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        Circulo marco = new Circulo();
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
        final double RADIO = 7.5;
        double circunferencia , area , volumen;
        
        circunferencia = 2 * Math.PI * RADIO ; 
        area = Math.PI * (RADIO * RADIO);
        volumen = (4 * Math.PI / 3) * RADIO * RADIO * RADIO;
        
        JOptionPane.showMessageDialog(null,
                       "La circunferencia del circulo es: " + circunferencia +
                "\n" + "El area del circulo es: "           + area + 
                "\n" + "El volumen de la esfera es: "        + volumen );
    }

    
}
