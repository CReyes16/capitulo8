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
public class Promedio extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        Promedio marco = new Promedio();
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
        int c1, c2, c3;
        double promedio;
        
        c1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la primer calificacion"));
        c2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu segunda calificacion"));
        c3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu tercer calificacion"));
        
        promedio = (c1 + c2 + c3) / 3;
        
        JOptionPane.showMessageDialog(null,
                "Primera calificacion: " + c1 + "\n" +
                "Segunda calificacion: " + c2 + "\n" +
                "Tercera calificacion: " + c3 + "\n" +
                "Promedio: " + promedio);        

        /*Conviertiendo los int en double de las calificaciones
        "Primera calificacion: " + Double.toString((double)c1) + "\n" +
                "Segunda calificacion: " + Double.toString((double)c2) + "\n" +
                "Tercera calificacion: " + Double.toString((double)c3) + "\n" +
                "Promedio: " + promedio);        
        */
    }

    
}
