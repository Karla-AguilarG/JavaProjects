package Model;

import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

public class Array_Functions {

    /*Llenamos el arreglo con números de tipo double(reales)
     con un rango de 0-10000 generados de manera aleatoria */
    public static double[] LlenarArregloAleatorio(int indice, int Tam_Array) {
        double[] Array = new double[Tam_Array];
        Random aleatorio = new Random();
        for (int i = 0; i < Tam_Array; i++) {
            Array[i] = 0 + aleatorio.nextDouble() * 10000;
        }
        return Array;
    }

    //Mostramos el arreglo en un JTable
    public static void MostrarArreglo(double[] Arreglo, DefaultTableModel tabla) {
        //Llenamos el modelo con los números del arreglo
        for (int i = 0; i < Arreglo.length; i++) {
            tabla.addRow(new Object[]{Arreglo[i]});
        }
    }
}
