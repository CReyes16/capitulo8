/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author CREYES
 */
public class Saludo extends JFrame{
    private JTextField textField;
    
    public static void main (String[] args){
        Saludo marco = new Saludo();
        marco.setSize(150,200);
        marco.crearGUI();
        marco.setVisible(true);
        
        
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        textField = new JTextField("Carlos Alberto Reyes Garcia");
        window.add(textField);
        
        
    }
    
}
