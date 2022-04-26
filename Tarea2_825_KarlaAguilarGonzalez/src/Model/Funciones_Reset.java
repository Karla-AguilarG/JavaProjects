package Model;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class Funciones_Reset {

    //Se recibe un vector de Modelos de los JTable y los limpiamos todos a la misma vez
    public static void LimpiarModelosJTables(DefaultTableModel[] ModelosTab) {
        for (DefaultTableModel tab : ModelosTab) {
            while (tab.getRowCount() != 0) {
                tab.removeRow(0);
            }
        }
    }

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

//Se recibe una matriz de tipo Objeto que contenga todos los arreglos de tipo objeto(Persona)
//para luego proceder a eliminar la información en todos  a la misma vez 
    public static void VaciarTodasPilas(Object[][] pilas) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 50; j++) {
                pilas[i][j] = null;
            }
        }
    }
}
