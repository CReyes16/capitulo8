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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author CREYES
 */
public class CapituloE510 extends JFrame implements ActionListener {
    
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args){
        CapituloE510 marco = new CapituloE510();
        marco.setSize(500 , 400);
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        button = new JButton("Haz clic");
        ventana.add(button);
        button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int hora = 1, minuto = 1, segundo = 2;
        int totalSegs = this.segs(hora,minuto,segundo);
        JOptionPane.showMessageDialog(null,
                hora + " hora " + minuto + " minuto " + segundo + " segundos " + "\n" +
                "Es igual a: " + totalSegs + " segundos");
    }

    private int segs(int hora, int minuto, int segundo) {
      final int dividirMinuto = 60;
      final int dividirSegundo = 3600;
      int thora, tminutos;
      
      thora = hora * dividirSegundo;
      tminutos = minuto * dividirMinuto;
      
      return thora + tminutos + segundo;
      
    }

    
}
