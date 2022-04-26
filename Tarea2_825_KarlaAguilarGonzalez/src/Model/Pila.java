package Model;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class Pila {

    //LLENAMOS LA LISTA DE DATOS CON TODAS LAS PERSONAS CUYOS ATRIBUTOS SON 
    //LA IDENTIFICACIÓN ALEATORIA DE 9 DÍGITOS Y ÚNICA + EDAD ALEATORIA
    public static void pushTodos(Persona Lista_Datos[], int tam, int indice) {
        Random aleatorio = new Random();
        while (indice < tam) {
            int Id = aleatorio.nextInt(900000000) + 100000000;
            boolean num_repetido = false;// Asumimos que aún no está repetido y la establecemos a false
            int Edad = 1 + aleatorio.nextInt(100);
            //Recorremos el arreglo comparando el número aleatorio con cada elemento del arreglo
            for (int i = 0; i < indice; i++) {
                if (Id == Lista_Datos[i].getIdentificacion()) {  //Realizamos la comparación
                    num_repetido = true;
                    break;
                }
            }
            if (!num_repetido) {
                // Almacenamos el ID y la EDAD en el arreglo
                Lista_Datos[indice] = new Persona(Id, Edad);
                indice++;
            }
        }
    }

    //LLENAMOS LAS 3 PILAS SEGÚN LA INFORMACIÓN CORRESPONDIENTE
    //LOS CONTADORES (TOPE) SE USAN PARA CONTAR LA CANTIDAD DE ELEMTOS QUE CUMPLEN CON LA CONDICIÓN
    //Y ASÍ TENER UN TOPE DE QUE SOLO HASTA ESE TOPE SE LLENE EL ARREGLO,POR EJEMPLO SI SE CUENTAN 5
    //ELEMENTOS MENORES A 18, ENTONCES LA PILA MENORES TENDRÁ 5 ELEMENTOS QUE CUMPLAN ESA CONDICIÓN
    public static void pushPilas(Persona Todos[], Persona Menores[], Persona Adultos[], Persona AdlMayores[], int tope1, int tope2, int tope3) {
        for (Persona Todo : Todos) {
            if (Todo.getEdad() < 18) {
                Menores[tope1] = Todo;
                tope1++;
            } else if (Todo.getEdad() >= 18 && Todo.getEdad() <= 64) {
                Adultos[tope2] = Todo;
                tope2++;
            } else if (Todo.getEdad() >= 65) {
                AdlMayores[tope3] = Todo;
                tope3++;
            }
        }
    }

    //MÉTODO PARA ELIMINAR UN ELEMENTO DE LA PILA
    public static void popPila(Persona persona[], int tope) {
        if (tope == 0) {
            JOptionPane.showMessageDialog(null, "La pila se encuentra vacía!");
        } else {
            tope--;
            JOptionPane.showMessageDialog(null, "Se va a eliminar el elemento [" + persona[tope] + "] de la pila");
            persona[tope] = null; // SE ELIMINA DE LA PILA
        }
    }

    //MÉTODO PARA OBTENER EL TAMAÑO DE LA CANTIDAD DE ELEMENTOS EN LA PILA
    public static int SizePila(Persona persona[], int pos_inicial) {
        for (Persona Pila_Persona : persona) {
            if (Pila_Persona != null) {
                pos_inicial++; //CONTAMOS LOS ELEMENTOS QUE SEAN DIFERENTES DE NULL
            }
        }
        return pos_inicial;
    }

    //MÉTODO PARA ELIMINAR LA INFORMACIÓN COMPLETA DE LA PILA
    public static void VaciarPila(Persona persona[]) {
        for (int i = 0; i < persona.length; i++) {
            persona[i] = null;
        }
    }

    //MOSTRAMOS LA INFORMACIÓN DE LA PILA DE MANERA REVERSA (TIPO PILA)
    public static void MostrarPilas(Persona Persona[], DefaultTableModel tabla, int cant_datos) {
        //BORRAMOS LA INFORMACIÓN DEL JTABLE
        while (tabla.getRowCount() != 0) {
            tabla.removeRow(0);
        }
        //MOSTRAMOS LA INFORMACIÓN DEL JTABLE
        for (int i = Persona.length - 1; i >= 0; i--) {
            //SI LA PILA ES DIFERENTE DE NULL, SE MUESTR LA IMFORMACIÓN,
            //PERSON EN CASO CONTRARIO SE MUESTRA EL CAMPO VACÍO
            if (Persona[i] != null) {
                tabla.addRow(new Object[]{"[" + cant_datos + "]  " + Persona[i].toString()});
            } else {
                tabla.addRow(new Object[]{""});
            }
            cant_datos--;
        }
    }

    //Mostramos la información de la Lista de manera ordenada 
    public static void MostrarLista(Persona persona[], DefaultTableModel tabla) {
        for (Persona Lista_persona : persona) {
            tabla.addRow(new Object[]{Lista_persona.toString()});
        }
    }
}
