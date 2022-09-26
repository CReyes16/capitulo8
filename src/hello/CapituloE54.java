
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

public class CapituloE54 extends JFrame implements ActionListener  {
    
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args){
        CapituloE54 marco = new CapituloE54();
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
        Graphics papel = panel.getGraphics();
        int xCentro = 50, yCentro = 50, radio = 100;
        this.dibujarCirculo(papel, xCentro, yCentro, radio);
        
    }

    private void dibujarCirculo(Graphics areaDibujo, int xCentro, int yCentro, int radio) {
        areaDibujo.drawOval(xCentro, yCentro, radio, radio);
    }

   
    
}
