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
import javax.swing.JOptionPane;
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
public class Capitulo6E65 extends JFrame implements ActionListener{
    
    private JTextField           
            txtMinuto   = new JTextField(2),
            txtSegundo  = new JTextField(2);
    
    private JLabel
            labelMinuto   = new JLabel("Minuto"),
            labelSegundo  = new JLabel("Segundo");
    
    private int tics = 0 , intMinutos, intSegundos;
    
    private Timer temporizador;
    
    private JPanel panel = new JPanel();
    
    public static void main(String[] args){
        Capitulo6E65 marco = new Capitulo6E65();
        marco.setSize(750, 600);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel.setPreferredSize(new Dimension(700,500));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        
        ventana.add(labelMinuto);
        ventana.add(txtMinuto);
        ventana.add(labelSegundo);
        ventana.add(txtSegundo);
        
        temporizador = new Timer(1000,this);
        temporizador.start();
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
       this.reloj(tics);
      
    }

    private void reloj(int segundero) {
       txtMinuto.setText(Integer.toString(segundero / 60));
       txtSegundo.setText(Integer.toString(segundero % 60));
       tics = segundero + 1; 
       
       intMinutos  = Integer.parseInt(txtMinuto.getText());
       intSegundos = segundero * 10;
       this.crearRectangulo(intMinutos,intSegundos );
    }


    private void crearRectangulo(int intMinutos, int intSegundos) {
        int minuto = intMinutos * 10;
        
        Graphics papel = panel.getGraphics();
        
        papel.setColor(Color.red);
        papel.fillRect(0, 100, minuto % 300, 50);
        
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 200,  intSegundos , 50);
        papel.setColor(Color.BLUE);
        papel.fillRect(0, 200,  intSegundos % 600 , 50);
    }

    
    

   
    
   
    
    
}
