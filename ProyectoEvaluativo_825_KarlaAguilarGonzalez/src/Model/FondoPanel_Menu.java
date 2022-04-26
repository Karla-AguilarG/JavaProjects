package Model;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class FondoPanel_Menu extends JPanel{
     private Image imagen;

    @Override

    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/Images/Fondo_Menu.jpg")).getImage();

        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);

        super.paint(g);
    }
}
