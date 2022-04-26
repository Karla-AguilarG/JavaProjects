package Clases_Datos;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

public class Datos_Arreglo {

    //Declaración del atributo de la clase
    private int[] Arreglo_Aleatorio = new int[100];

    //Constructor con parámetros
    public Datos_Arreglo(int[] Arreglo_Aleatorio) {
        this.Arreglo_Aleatorio = new int[100];
    }

    //Constructor Vacío
    public Datos_Arreglo() {
    }

//Get and set del atributo de la clase
    public int[] getArreglo_Aleatorio() {
        return Arreglo_Aleatorio;
    }

    public void setArreglo_Aleatorio(int[] Arreglo_Aleatorio) {
        this.Arreglo_Aleatorio = Arreglo_Aleatorio;
    }

    
}
