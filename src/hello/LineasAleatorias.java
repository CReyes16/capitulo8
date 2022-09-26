
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
import javax.swing.JPanel;

public class LineasAleatorias extends JFrame implements ActionListener  {
    
  
    private JButton button;
    private JPanel panel;
    private Random posicionesAleatorias = new Random();
   
    public static void main(String[] args){
        LineasAleatorias marco = new LineasAleatorias();
        marco.setSize(150 , 200);
        marco.crearGUI();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
    
    void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 100));
        panel.setBackground(Color.white);
        ventana.add(panel);
        
        button = new JButton("Haz clic");
        ventana.add(button);
        button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int xFinal, yFinal;
        Graphics papel = panel.getGraphics();
        
        papel.setColor(Color.white);
        papel.fillRect(0, 0, 100, 100);
        papel.setColor(Color.black);
        
        xFinal = posicionesAleatorias.nextInt(100);
        yFinal = posicionesAleatorias.nextInt(100);
        papel.drawLine(0, 0, xFinal, yFinal);
    }

    

  
   
   
    
}
