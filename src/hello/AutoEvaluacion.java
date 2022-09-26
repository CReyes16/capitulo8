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
public class AutoEvaluacion extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        AutoEvaluacion marco = new AutoEvaluacion();
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
        int  mitad = 2000 * (1 / 2 );
        JOptionPane.showMessageDialog(null, "La mitad es: " + mitad);
        
        int a, b, c, d;
        a = 7 / 3;
        b = a * 4;
        c = ( a + 1 ) / 2;
        d = c / 3;
        
        JOptionPane.showMessageDialog(
                null, "El valor de a es: " + a + 
                      " El valor de b es: " + b + 
                      " El valor de c es: " + c + 
                      " El valor de d es: " + d );
    }

    
}
