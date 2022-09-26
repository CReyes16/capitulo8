
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

public class MetodoTriangulo extends JFrame implements ActionListener  {
    
    private JButton button;
    private JPanel panel;
    
    public static void main(String[] args){
        MetodoTriangulo marco = new MetodoTriangulo();
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
        dibujarLogo(papel, 10, 20);
        dibujarLogo(papel, 100, 100);
        dibujarTriangulo(papel, 100, 10 , 40, 40);
        dibujarTriangulo(papel, 10, 100, 20, 60);
        
        
    }

    private void dibujarLogo(Graphics areaDibujo, int xPos, int yPos) {
        areaDibujo.drawRect(xPos, yPos, 60, 60);
        areaDibujo.drawRect(xPos, yPos, 40, 40);
        areaDibujo.drawRect(xPos, yPos, 20, 20);
    }

    private void dibujarTriangulo(Graphics areaDibujo, int lugarX, int lugarY, int anchura, int altura) {
      
        areaDibujo.drawLine(lugarX, lugarY, lugarX, lugarY + altura);
        areaDibujo.drawLine(lugarX, lugarY + altura, lugarX + anchura, lugarY + altura );
        areaDibujo.drawLine(lugarX, lugarY, lugarX + anchura, lugarY + altura);
    }

   
    
}
