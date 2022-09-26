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
public class ContadorAutos extends JFrame implements ActionListener{
    
    private JButton botón;
    private int cuentaAutos = 0;
    
    public static void main(String[] args){
        ContadorAutos marco = new ContadorAutos();
        marco.setSize(300, 150);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        botón = new JButton("Entra un auto");
        ventana.add(botón);
        botón.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        cuentaAutos = cuentaAutos + 1;
        
        JOptionPane.showMessageDialog(null,"Autos: " + cuentaAutos);
    }

    
}
