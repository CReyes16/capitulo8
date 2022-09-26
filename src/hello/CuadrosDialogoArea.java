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
public class CuadrosDialogoArea extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        CuadrosDialogoArea marco = new CuadrosDialogoArea();
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
        
        int area;
        int longitud;
        int anchura;
        
        String longitudString;
        String anchuraString;
        
        longitudString = JOptionPane.showInputDialog("Longitud: ");
        longitud = Integer.parseInt(longitudString);
        
        anchuraString = JOptionPane.showInputDialog("Ancho: ");
        anchura = Integer.parseInt(anchuraString);
        
        area = longitud * anchura;
        JOptionPane.showMessageDialog(null,"El area es: " +  area);
                       
    }

    
}
