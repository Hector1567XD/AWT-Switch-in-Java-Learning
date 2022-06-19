/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos2d;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
/**
 *
 * @author hecto
 */
public class Interface1 extends JPanel {
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.RED);
        g.drawLine(100, 100, 500, 500);
        g.setColor(Color.BLUE);
        g.drawLine(-100, 150, 300, 400);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Intro a Graficos");
        Interface1 objeto = new Interface1();
        ventana.add(objeto);
        ventana.setSize(1024, 720);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
