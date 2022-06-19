package graficos2d;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 *
 * @author hecto
 */
public class InterfaceGamePrototype extends JPanel {

    static int VK_UP = 38;
    static int VK_RIGHT = 39;
    static int VK_BOTTOM = 40;
    static int VK_LEFT = 37;

    static int x = 512-32;
    static int y = 360-32;
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("PAINT CALLED");
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/rockman.png"));
        g.drawImage(imagen.getImage(), x, y, 64, 64, this);
    }

    public void main(String[] args) {
        JFrame ventana = new JFrame("Game Prototype");
        InterfaceGamePrototype objeto = new InterfaceGamePrototype();
        ventana.add(objeto);
        ventana.setSize(1024, 720);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ventana.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                /*int VK_UP = 38;
                int VK_RIGHT = 39;
                int VK_BOTTOM = 40;
                int VK_LEFT = 37;*/
                if (e.getKeyCode() == VK_UP) {
                    y -= 5;
                }else if (e.getKeyCode() == VK_RIGHT) {
                    x += 5;
                }else if (e.getKeyCode() == VK_BOTTOM) {
                    y += 5;
                }else if (e.getKeyCode() == VK_LEFT) {
                    x -= 5;
                }
                ventana.repaint();
                repaint();
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key pressed code=" + e.getKeyCode() + ", char=" + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}
