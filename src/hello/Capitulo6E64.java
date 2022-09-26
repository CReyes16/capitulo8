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
public class Capitulo6E64 extends JFrame implements ActionListener, ChangeListener{
    
   
        private JPanel panel = new JPanel();
        private int 
                ancho = 5, 
                longitud = 20, 
                volumen,
                profundidaPromedio, 
                v,
                vProfundo,
                vPocoProfundo;
        
        private JSlider 
                eProfundo       = new JSlider(1,100,1),
                ePocoProfundo   = new JSlider(1,50,1);
        
        private JLabel
                lProfundo     = new JLabel("Extremo profundo"),
                lPocoProfundo = new JLabel("Extremo poco profundo");
        
        private JTextField
                tProfundo     = new JTextField(3),
                tPocoProfundo = new JTextField(3);
        
      
    public static void main(String[] args){
        Capitulo6E64 marco = new Capitulo6E64();
        marco.setSize(500, 500);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
       
        ventana.add(lProfundo);
        ventana.add(eProfundo);
        eProfundo.addChangeListener(this);
        ventana.add(tProfundo);
        
        ventana.add(lPocoProfundo);
        ventana.add(ePocoProfundo);
        ePocoProfundo.addChangeListener(this);
        ventana.add(tPocoProfundo);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
       
      
    }

    
    @Override
    public void stateChanged(ChangeEvent e) {
      
        volumen = this.calculaVolumen(ancho, longitud, profundidaPromedio);
        
                
        vProfundo       = eProfundo.getValue();
        vPocoProfundo   = ePocoProfundo.getValue();
            
        tProfundo.setText(Integer.toString(vProfundo));
        tPocoProfundo.setText(Integer.toString(vPocoProfundo));
        
        profundidaPromedio = (vProfundo + vPocoProfundo) / 2;
        
        this.dibujarAlberca(longitud, vProfundo, vPocoProfundo ,profundidaPromedio);
        
    }

    private int calculaVolumen(int ancho, int longitud, int profundidaPromedio) {
       
       return v = profundidaPromedio * ancho * longitud;
    }

    private void dibujarAlberca(int longitud, int vProfundo, int vPocoProfundo, int profundidaPromedio ) {
        Graphics papel = panel.getGraphics();
                     //x   y  ancho  
        papel.drawLine(50, 1, 200, 1);
        papel.drawLine(50, vProfundo, 50, vProfundo);
        papel.drawLine(200, vPocoProfundo, 200, vPocoProfundo);
        papel.drawLine(50, 100, 200, 50);
    }

   
    
   
    
    
}
