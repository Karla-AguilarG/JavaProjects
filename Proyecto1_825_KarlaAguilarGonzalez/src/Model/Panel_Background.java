package Model;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

//Clase para agregar una imagen al fondo del panel 
public class Panel_Background extends JPanel {

    private Image imagen;

    @Override

    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/Images/MYSplash.gif")).getImage();

        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);

        super.paint(g);
    }
}
