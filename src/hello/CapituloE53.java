/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author CREYES
 */
public class CapituloE53 extends JFrame implements ActionListener{
    
    private JButton botón;
    
    public static void main(String[] args){
        CapituloE53 marco = new CapituloE53();
        marco.setSize(400, 300);
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        botón = new JButton("Haga clic");
        ventana.add(botón);
        botón.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int salario, añosLaborados;
        salario       = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu salario"));
        añosLaborados = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tus años laborados"));
        this.mostrarIngresos(salario,añosLaborados);
    }

    private void mostrarIngresos(int sueldo, int antiguedad) {
    
        JOptionPane.showMessageDialog(null,
                "Tu salario es: " + sueldo + 
                " y " + 
                " tus años laborados son: " + antiguedad);
    }

   

   
    

    

    
}
