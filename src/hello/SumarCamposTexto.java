
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
import javax.swing.JTextField;

public class SumarCamposTexto extends JFrame implements ActionListener  {
    
  
    private JTextField campoNumero1, campoNumero2, campoSuma;
    private JLabel etiquetaIgual;
    private JButton botonSuma;
    
  
   
    public static void main(String[] args){
        SumarCamposTexto marco = new SumarCamposTexto();
        marco.setSize(350 , 100);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        campoNumero1 = new JTextField(7);
        ventana.add(campoNumero1);
        
        botonSuma = new JButton("+");
        ventana.add(botonSuma);
        botonSuma.addActionListener(this);
        
        campoNumero2 = new JTextField(7);
        ventana.add(campoNumero2);
        
        etiquetaIgual = new JLabel(" = ");
        ventana.add(etiquetaIgual);
        
        campoSuma = new JTextField(7);
        ventana.add(campoSuma);
               
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int numero1 = Integer.parseInt(campoNumero1.getText());
        int numero2 = Integer.parseInt(campoNumero2.getText());
        campoSuma.setText(Integer.toString(numero1 + numero2));
    }

    

  
   
   
    
}
