package Clases_Funciones;

import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

public class Funciones_Arreglo {
    
    //Llenamos el arreglo con datos Aleatorios y evitamos que se repitan
    public static int [] LlenarArregloAleatorio( int indice, int Tam_Array) {
        int[] Array = new int[Tam_Array]; 
        Random aleatorio = new Random();
        while (indice < Tam_Array) {
            int AleatoryNum_Unique = 0 + aleatorio.nextInt(1000);   // Variable que indica si el número propuesto está repetido
            boolean num_repetido = false;// Asumimos que aún no está repetido y la establecemos a false

            while (!num_repetido) { //Se ejecutará mientras el número no esté repetido
                //Recorremos el arreglo comparando el número aleatorio con cada elemento del arreglo
                for (int i = 0; i < indice; i++) {
                    if (AleatoryNum_Unique == Array[i]) {  //Realizamos la comparación
                        num_repetido = true;
                        break;
                    }
                }
                // verificamos el estado del valor repetido
                if (!num_repetido) {
                    // almacenamos el valor propuesto ya que no está repetido
                    Array[indice] = AleatoryNum_Unique;
                    indice++;
                }
            }
        }
        return Array;
    }

    //Mostramos el arreglo en un JTable
    public static void MostrarArreglo(int[] Arreglo, DefaultTableModel tabla) {
        //Limpiamos el modelo de la Tabla
        while (tabla.getRowCount() != 0) {
            tabla.removeRow(0);
        }

        //Llenamos el modelo con la posición y el número del arreglo
        for (int i = 0; i < Arreglo.length; i++) {
            tabla.addRow(new Object[]{i, Arreglo[i]});
        }
    }
  
  
    
    //Método  Recursivo para determinar el número Mayor en el Arreglo
    public static int NumeroMayorArreglo(int[] Array, int Mayor, int i) {

        if (i == Array.length) {
            return Mayor;
        }else if (Array[i] > Mayor) { 
            Mayor = Array[i];
        }
        return NumeroMayorArreglo(Array, Mayor, i + 1);
    }
    
    //Método  Recursivo para determinar el número Menor en el Arreglo
    public static int NumeroMenorArreglo(int[] Array, int Menor,int i) {
        if (i == Array.length) {
            return Menor;
        }else if (Array[i] < Menor) { 
            Menor = Array[i];
        }
        return NumeroMenorArreglo(Array, Menor, i + 1);
    }
    
    //Método Recursivo para buscar el índice de un número en el arreglo
    public static int BuscarIndiceNum(int[] arreglo, int numero_array, int indice) {
        if (arreglo[indice] == numero_array) {
            return indice;
        }
        return BuscarIndiceNum(arreglo, numero_array, indice + 1);
    }

     //Método  Recursivo para contar los números Pares en el Arreglo
    public static int ContarNumerosParesArreglo(int[] Arreglo, int i) {
        if (i < Arreglo.length) {
            if (Arreglo[i] % 2 == 0) {
                return 1 + ContarNumerosParesArreglo(Arreglo, i + 1);
            } else {
                return 0 + ContarNumerosParesArreglo(Arreglo, i + 1);
            }
        }
        return 0;
    }
    
    //Método para contar los números Impares en el Arreglo
    public static int ContarNumerosImParesArreglo(int Arreglo[], int i) {
        if (i < Arreglo.length) {
            if (Arreglo[i] % 2 == 0) {
                return 0 + ContarNumerosImParesArreglo(Arreglo, i + 1);
            } else {
                return 1 + ContarNumerosImParesArreglo(Arreglo, i + 1);
            }
        }
        return 0;
    }   
}
