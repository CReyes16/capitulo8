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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author CREYES
 */
public class ContadorAutosCTexto extends JFrame implements ActionListener{
    
    private JTextField muestraAuto;
    private JLabel txtTAuto;
    private JButton botón;
    private int cuentaAutos = 0;
    
    public static void main(String[] args){
        ContadorAutosCTexto marco = new ContadorAutosCTexto();
        marco.setSize(500, 100);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        botón = new JButton(" Entra un auto ");
        ventana.add(botón);
        botón.addActionListener(this);
        
        txtTAuto = new JLabel(" Numero de autos: ");
        ventana.add(txtTAuto);
        
        muestraAuto = new JTextField(7);
        ventana.add(muestraAuto);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        cuentaAutos = cuentaAutos + 1;
        muestraAuto.setText(Integer.toString(cuentaAutos));
        
    }

    
}
