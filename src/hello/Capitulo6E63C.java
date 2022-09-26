/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author CREYES
 */
public class Capitulo6E63C extends JFrame implements ActionListener{
    
    private int 
            c = 0 , 
            f = 0;
    
    private JTextField
            txtC = new JTextField(3),
            txtF = new JTextField(3);
    
    private JLabel
            labelC = new JLabel("Celcius"),
            labelF = new JLabel("Fahrenheit");
    
    private JButton
            BConvertir = new JButton("Convertir");
    
    private JPanel
            panel = new JPanel();
            
    public static void main(String[] args){
        Capitulo6E63C marco = new Capitulo6E63C();
        marco.setSize(350, 400);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
       
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        
        ventana.add(labelC);
        ventana.add(txtC);
        
        ventana.add(BConvertir);
        BConvertir.addActionListener(this);
        
        ventana.add(labelF);
        ventana.add(txtF);
     
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c = Integer.parseInt(txtC.getText());
        int convertir = this.conversor(c);
        txtF.setText(Integer.toString(convertir));
        this.dibujaRectangulo(convertir, c);
       
    }
    
    private int conversor(int c) {
        
        return f = (c * 9) / 5 + 32;
    }
    
    private void dibujaRectangulo(int convertir, int c) {
    
        Graphics papel = panel.getGraphics();
        
        papel.setColor(Color.red);
        papel.fillRect(0, 50, c, 20 );
        papel.setColor(Color.BLUE);
        papel.fillRect(0, 100,convertir , 20);
        
    }

 

   

    

    
    

    
}
