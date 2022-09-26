
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
import javax.swing.JPanel;

public class AutoEvaluacion7 extends JFrame implements ActionListener  {
    
    private JButton button;
    private JPanel panel;
   
    
    public static void main(String[] args){
        AutoEvaluacion7 marco = new AutoEvaluacion7();
        marco.setSize(400 , 300);
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        ventana.add(panel);
        
        button = new JButton("Haz clic");
        ventana.add(button);
        button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int a = 10 , b = 20;
        Graphics papel = panel.getGraphics();
        dibujarLogo(papel, a, b);
        dibujarLogo(papel, b + a , b - a);
        dibujarLogo(papel, b + a - 3, b - a - 4);
        
        
        
        
    }

    private void dibujarLogo(Graphics areaDibujo, int xPos, int yPos) {
        areaDibujo.drawRect(xPos, yPos, 60, 60);
        areaDibujo.drawRect(xPos, yPos, 40, 40);
        areaDibujo.drawRect(xPos, yPos, 20, 20);
    }

    

   
    
}
