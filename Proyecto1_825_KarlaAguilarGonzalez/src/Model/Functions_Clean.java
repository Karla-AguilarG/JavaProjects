package Model;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

public class Functions_Clean {

    //Se recibe un vector de JLabels y se limpian 
    public static void LimpiarJLabels(JLabel[] CampoLabel) {
        for (JLabel lab : CampoLabel) {
            lab.setText("");
        }
    }

    //Se recibe un vector de Modelos de los JTable y los limpiamos todos a la misma vez
    public static void LimpiarModelosJTables(DefaultTableModel[] ModelosTab) {
        for (DefaultTableModel tab : ModelosTab) {
            while (tab.getRowCount() != 0) {
                tab.removeRow(0);
            }
        }
    }
}
