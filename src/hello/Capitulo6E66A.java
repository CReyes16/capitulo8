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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author CREYES
 */
public class Capitulo6E66A extends JFrame implements  ChangeListener{
    
   private JLabel
           labelVertical   = new JLabel(" Vertical "),
           labelHorizontal = new JLabel(" Horizontal "),
           labelDiametro   = new JLabel("Diametro");
   
   private JTextField
           txtVertical   = new JTextField(8),
           txtHorizontal = new JTextField(8),
           txtDiametro   = new JTextField(8);
   
   private JSlider
           ejeVertical   = new JSlider(JSlider.HORIZONTAL,0,700,0),
           ejeHorizontal = new JSlider(JSlider.HORIZONTAL,0,700,0),
           ejeDiametro   = new JSlider(JSlider.HORIZONTAL,0,700,0);
   
   private JPanel panel = new JPanel();
   
   private Random posicionAleatoria = new Random();
    
    public static void main(String[] args){
        Capitulo6E66A marco = new Capitulo6E66A();
        marco.setSize(550, 700);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel.setPreferredSize(new Dimension(500,500));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
       
        ventana.add(labelVertical);
        ventana.add(ejeVertical);
        ejeVertical.addChangeListener(this);
        ventana.add(txtVertical);
        
        ventana.add(labelHorizontal);
        ventana.add(ejeHorizontal);
        ejeHorizontal.addChangeListener(this);
        ventana.add(txtHorizontal);
        
        ventana.add(labelDiametro);
        ventana.add(ejeDiametro);
        ejeDiametro.addChangeListener(this);
        ventana.add(txtDiametro);
        
    }
    
   
    @Override
    public void stateChanged(ChangeEvent e) {
        int valorVertical   = ejeVertical.getValue();
        int valorHorizontal = ejeHorizontal.getValue();
        int valorDiametro   = ejeDiametro.getValue();
        
        txtVertical.setText(Integer.toString(valorVertical));
        txtHorizontal.setText(Integer.toString(valorHorizontal));
        txtDiametro.setText(Integer.toString(valorDiametro));
        
        this.dibujarCirculo(valorVertical, valorHorizontal, valorDiametro);
    }

    private void dibujarCirculo(int valorVertical, int valorHorizontal, int valorDiametro) {
        int xP, yP;
        Graphics papel = panel.getGraphics();
        xP = posicionAleatoria.nextInt(700);
        yP = posicionAleatoria.nextInt(700);
       
        
        papel.setColor(Color.YELLOW);
        papel.fillOval(xP , yP , 30 , 30);
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 500, 500);
        papel.setColor(Color.red);
        papel.fillOval(valorHorizontal, valorVertical, valorDiametro, valorDiametro);
        papel.setColor(Color.blue);
        papel.fillOval(xP , yP , 30 , 30);
    }

    
    
}
