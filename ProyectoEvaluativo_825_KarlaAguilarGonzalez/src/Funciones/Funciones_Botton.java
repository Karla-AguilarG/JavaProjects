package Funciones;

import javax.swing.JButton;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

public class Funciones_Botton {
    //Se recibe un vector de Botones y los activamos todos a la misma vez 
    public static void ActivarBotones(JButton[] botones) {
        for (JButton btn : botones) {
            btn.setEnabled(true);
        }
    }

    //Se recibe un vector de Botones y los desactivamos todos a la misma vez 
    public static void DesactivarBotones(JButton[] botones) {
        for (JButton btn : botones) {
            btn.setEnabled(false);
        }
    }
}
