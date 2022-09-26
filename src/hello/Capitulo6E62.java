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
public class Capitulo6E62 extends JFrame implements ActionListener{
    
    private int numero, suma, promedio = 0;
    private JTextField 
            txtNumero   = new JTextField(8), 
            txtSuma     = new JTextField(8),
            txtPromedio = new JTextField(8);
    
    private JLabel 
            labelNumero   = new JLabel("Numero aleatorio: "), 
            labelSuma     = new JLabel("Suma: "), 
            labelPromedio = new JLabel("Promedio: ");
    
    private JButton 
            boton = new JButton("Comenzar");
    
    private Random numeroR = new Random();
    
    
    public static void main(String[] args){
        Capitulo6E62 marco = new Capitulo6E62();
        marco.setSize(700, 300);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        ventana.add(labelNumero);
        ventana.add(txtNumero);
        ventana.add(labelSuma);
        ventana.add(txtSuma);
        ventana.add(labelPromedio);
        ventana.add(txtPromedio);
        ventana.add(boton);
        boton.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        numero =  this.numeroAleatorio(200,400); 
        suma = this.sumaNumero(numero);
        promedio = this.porcentajeNumero(numero, suma);
        txtNumero.setText(Integer.toString(numero));
        txtSuma.setText(Integer.toString(suma));
        txtPromedio.setText(Integer.toString(promedio));
    }

    private int numeroAleatorio(int numeroInicial, int numeroFinal) {
       return numeroR.nextInt(numeroInicial, numeroFinal);
    }

    private int sumaNumero(int numero) {
        return numero + numero;
    }

    private int porcentajeNumero(int numero, int suma) {
        return  (numero + suma) / 2;
    }
    
}
