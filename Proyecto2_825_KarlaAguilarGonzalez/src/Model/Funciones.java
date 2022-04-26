package Model;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class Funciones {

    //Le enviamos por parametro los colores del fondo y los colores de la letra para hacerlo dinámico
    public static void ButtonInput(JButton MyBoton, int a, int b, int c, int d, int e, int f) {

        MyBoton.setBackground(new Color(a, b, c)); //COLOR DEL FONDO DEL BOTÓN
        MyBoton.setForeground(new Color(d, e, f));//COLOR DE LA LETRA DEL BOTÓN
    }
    
    //Le enviamos por parametro los colores del fondo y los colores de la letra para hacerlo dinámico
    public static void ButtonOutput(JButton MyBoton, int a, int b, int c, int d, int e, int f) {

       MyBoton.setBackground(new Color(a, b, c));//COLOR DEL FONDO DEL BOTÓN
       MyBoton.setForeground(new Color(d, e, f));//COLOR DE LA LETRA DEL BOTÓN
    }

    //Se recibe un vector de JLabel y los personalizamos todos a la misma vez 
    public static void ModificarTags(JLabel[] MyTags) {
        for (JLabel tag : MyTags) {
            tag.setFont(new java.awt.Font("Times New Roman", 1, 36));
            tag.setForeground(new java.awt.Color(255, 255, 255));
            tag.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            tag.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            tag.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        }
    }
}
