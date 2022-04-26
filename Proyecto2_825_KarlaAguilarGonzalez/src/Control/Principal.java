/*      UNIVERSIDAD ESTATAL A DISTANCIA
   Curso:  Estructura de Datos
   Código: 0825
   Proyecto 2
   Tutora:  Miriam Mora
   Grupo: 06
   Estudiante: Karla Bricelda Aguilar González
   Cédula: 155825898214
   II Cuatrimestre 2021
   Fecha de Inicio: Lunes 19 de Julio 2021
   Fecha de finalización: Domingo 25 Julio 2021
 */
package Control;

import View.Splash;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal {

    public static void main(String[] args) {
        //LE DAMOS UN FORMATO DE APARIENCIA NIMBUS EN EL JRAME Y DEMÁS COMPONENTES DE LA VENTANA
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }

        // Se ejecuta el programa  con un splash en el inicio,para luego mostrar el menú
        new Thread(new Splash()).start();
    }
}
