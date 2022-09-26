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
public class SumarNumeros extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        SumarNumeros marco = new SumarNumeros();
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
        
      int num1 = 5 , num2 = 5 , num3 = 5, sumarDos, sumarTres;
      
      sumarDos = this.sumarNumeros(num1,num2);
      sumarTres = this.sumarNumeros(num1, num2, num3);
      
      JOptionPane.showMessageDialog(null,
              "La suma de dos numeros es: "  + sumarDos + "\n" + 
              "La suma de tres numeros es: " + sumarTres);
      
    }

    private int sumarNumeros(int numero1, int numero2) {
        return numero1 +  numero2;
    }

    private int sumarNumeros(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }

    
}
