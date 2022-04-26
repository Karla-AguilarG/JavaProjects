/*      UNIVERSIDAD ESTATAL A DISTANCIA
   Curso:  Estructura de Datos
   Código: 0825
   Tarea 2
   Tutora:  Miriam Mora
   Grupo: 06
   Estudiante: Karla Bricelda Aguilar González
   Cédula: 155825898214
   II Cuatrimestre 2021
   Fecha de Inicio: 28 de Junio 2021
   Fecha de finalización: 10 Julio 2021
 */

package Control;

import View.Splash;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

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
