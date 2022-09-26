
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EdadAleatorio extends JFrame implements ActionListener  {
    
  
    private JButton button;
    private JPanel panel;
    private Random edadAleatorias = new Random();
   
    public static void main(String[] args){
        EdadAleatorio marco = new EdadAleatorio();
        marco.setSize(150 , 200);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
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
        
        int ramdomEdad = aleatorioEnRango(16,59);
        JOptionPane.showMessageDialog(null, ramdomEdad);
    }

    private int aleatorioEnRango(int edadMinima, int edadMaxima) {
      
        return edadAleatorias.nextInt(edadMinima, edadMaxima);
       
    }

    

  
   
   
    
}
