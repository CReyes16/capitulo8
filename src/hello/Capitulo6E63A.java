/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author CREYES
 */
public class Capitulo6E63A extends JFrame implements ActionListener{
    
    private int c = 0 , f = 0;
    private JTextField 
            txtCelcius    = new JTextField(8),
            txtFahrenheit = new JTextField(8);
    
    private JLabel
            lCelcius      = new JLabel("Celcius"),
            lFahrenheit   = new JLabel("Fahrenheit");
    
    private JButton
            bConvertir    = new JButton("Convertir");
    
    
    public static void main(String[] args){
        Capitulo6E63A marco = new Capitulo6E63A();
        marco.setSize(700, 300);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        ventana.add(lCelcius);
        ventana.add(txtCelcius);
        ventana.add(bConvertir);
        bConvertir.addActionListener(this);
        ventana.add(lFahrenheit);
        ventana.add(txtFahrenheit);
       
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        c = Integer.parseInt(txtCelcius.getText());
        int convertir = this.convierteGrados(c);
        txtFahrenheit.setText(Integer.toString(convertir));
    }

    private int convierteGrados(int f) {
    
        return f = (c * 9) / 5 + 32;
    }

    
    
}
