package Model;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class Ordinances {

    // Algoritmo de ordenamiento Quicksort
    public static double[] Ord_QuickSort(double[] arreglo, int izquierda, int derecha) {
        double pivote = arreglo[izquierda];
        int i = izquierda;
        int j = derecha;
        double auxIntercambio;

        while (i < j) {
            while (arreglo[i] <= pivote && i < j) {
                i++;
            } //FIN WHILE
            while (arreglo[j] > pivote) {
                j--;
            } //FIN WHILE
            if (i < j) {
                auxIntercambio = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxIntercambio;
            } //FIN IF
        }//FIN WHILE
        arreglo[izquierda] = arreglo[j];
        arreglo[j] = pivote;
        if (izquierda < j - 1) {
            Ord_QuickSort(arreglo, izquierda, j - 1);
        }//FIN IF
        if (j + 1 < derecha) {
            Ord_QuickSort(arreglo, j + 1, derecha);
        }//FIN IF

        return arreglo; //RETORNA EL ARREGLO ORDENADO

    }

    // Algoritmo de ordenamiento ShellSort
    public static double[] Ord_Shell(double[] arreglo) {

        int N_arreglo = arreglo.length;
        int incremento = N_arreglo;

        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N_arreglo; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && arreglo[j] < arreglo[j - incremento]) {
                        double temporal = arreglo[j];
                        arreglo[j] = arreglo[j - incremento];
                        arreglo[j - incremento] = temporal;
                        j -= incremento;
                    }//FIN WHILE
                } //FIN FOR
            }//FIN FOR
        } while (incremento > 1);//FIN DO WHILE

        return arreglo; //RETORNA EL ARREGLO ORDENADO
    }

    // Algoritmo de ordenamiento Burbuja
    public static double[] Ord_Burbuja(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                double elementoActual = arreglo[j],
                        elementoSiguiente = arreglo[j + 1];
                if (elementoActual > elementoSiguiente) {
                    // Intercambiar
                    arreglo[j] = elementoSiguiente;
                    arreglo[j + 1] = elementoActual;
                }//FIN IF
            }//FIN FOR
        }//FIN FOR
        return arreglo; //RETORNA EL ARREGLO ORDENADO
    }
}
