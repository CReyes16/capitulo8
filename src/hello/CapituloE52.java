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
public class CapituloE52 extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        CapituloE52 marco = new CapituloE52();
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
        String nombre, apellido; 
        nombre = JOptionPane.showInputDialog(null,"Ingresa tu nombre");
        apellido = JOptionPane.showInputDialog(null,"Ingresa tu apellido");
        this.mostrarNombre(nombre,apellido);
    }

    private void mostrarNombre(String dato1, String dato2) {
        JOptionPane.showMessageDialog(null,"Tu nombre es: " + dato1);
        JOptionPane.showMessageDialog(null,"Tu apellido es: " + dato2);
    }

   
    

    

    
}
