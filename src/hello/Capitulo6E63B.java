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
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author CREYES
 */
public class Capitulo6E63B extends JFrame implements ActionListener, ChangeListener{
    
    private int c = 0 , f = 0;
    private JTextField 
            txtCelcius    = new JTextField(8),
            txtFahrenheit = new JTextField(8);
    
    private JLabel
            lCelcius      = new JLabel("Celcius"),
            lFahrenheit   = new JLabel("Fahrenheit");
    
    private JButton
            bConvertir    = new JButton("Convertir");
    
    private JSlider 
            deslizable    = new JSlider(JSlider.HORIZONTAL,0,100,0);
    
    
    public static void main(String[] args){
        Capitulo6E63B marco = new Capitulo6E63B();
        marco.setSize(750, 100);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        ventana.add(lCelcius);
        ventana.add(deslizable);
        deslizable.addChangeListener(this);
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

    
    @Override
    public void stateChanged(ChangeEvent e) {
         int valorDes = deslizable.getValue();
         txtCelcius.setText(Integer.toString(valorDes));
    }

    private int convierteGrados(int c) {
    
         return f = (c * 9) / 5 + 32;
    }
    
   
    
    
}
