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
public class GotasDeLluvia extends JFrame implements ActionListener, ChangeListener{
    
    private JPanel panel;
    private Random aleatorio;
    private javax.swing.Timer temporizador;
    private JSlider deslizable;
    private JTextField campoIntervalo;
    private JLabel etiquetaIntervalo;
    
    public static void main(String[] args){
        GotasDeLluvia marco = new GotasDeLluvia();
        marco.setSize(250, 300);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        aleatorio = new Random();
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        
        etiquetaIntervalo = new JLabel("Intervalo de tiempo");
        ventana.add(etiquetaIntervalo);
        campoIntervalo = new JTextField(10);
        ventana.add(campoIntervalo);
        
        deslizable =  new JSlider(JSlider.HORIZONTAL, 200, 2000, 1000);
        ventana.add(deslizable);
        deslizable.addChangeListener(this);
        
        campoIntervalo.setText(Integer.toString(deslizable.getValue()));
        temporizador = new javax.swing.Timer(1000, this);
        temporizador.start();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        int x,y,tamaño;
        Graphics papel = panel.getGraphics();
        x = aleatorio.nextInt(200);
        y = aleatorio.nextInt(200);
        tamaño = aleatorio.nextInt(20);
        papel.fillOval(x, y, tamaño, tamaño);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
        int timeGap = deslizable.getValue();
        campoIntervalo.setText(Integer.toString(timeGap));
        temporizador.setDelay(timeGap);
    }
    
    

    
}
