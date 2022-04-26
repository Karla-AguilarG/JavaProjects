package Clases_Funciones;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

public class Funciones_Validar {

    //Función que recibe mediante un vector de JTextField cada campo para  ser evaluado y validar si está vacío o no
    public static boolean CamposVacios(JTextField[] CamposTexto) {
        for (JTextField txt : CamposTexto) {
            if (txt.getText().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    
    public static void LimpiarJTextFields(JTextField[] CamposTexto) {
        for (JTextField txt : CamposTexto) {
            txt.setText("");
        }
    }

    public static void LimpiarJLabels(JLabel[] CampoLabel) {
        for (JLabel lab : CampoLabel) {
            lab.setText("");
        }
    }
    
    public static void TransparenciaJPanel(JPanel[] Panel) {
        for (JPanel panel : Panel) {
            panel.setBackground(new Color(0, 0, 0, 30));
        }
    }
}
