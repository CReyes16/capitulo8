/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author CREYES
 */
public class EjemploTimer extends JFrame implements ActionListener{
    
    private JTextField campoSegs, campoMins;
    private JLabel etiquetaSegs, etiquetaMins;
    private int tics = 0;
    private Timer temporizador;
    
    public static void main(String[] args){
        EjemploTimer marco = new EjemploTimer();
        marco.setSize(300, 100);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        etiquetaMins = new JLabel( "Mins: ");
        ventana.add(etiquetaMins);
        
        campoMins = new JTextField(2);
        ventana.add(campoMins);
        
        etiquetaSegs = new JLabel(" Seg: ");
        ventana.add(etiquetaSegs);
        
        campoSegs = new JTextField(2);
        ventana.add(campoSegs);
        
        temporizador = new Timer(1000, this);
        temporizador.start();
     
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        campoMins.setText(Integer.toString(tics / 60));
        campoSegs.setText(Integer.toString(tics % 60));
        
        tics = tics + 1;
        
    }

    
}
