/*      UNIVERSIDAD ESTATAL A DISTANCIA
   Curso:  Estructura de Datos
   Código: 0825
   Tarea 1
   Tutora:  Miriam Mora
   Grupo: 06
   Estudiante: Karla Bricelda Aguilar González
   Cédula: 155825898214
   II Cuatrimestre 2021
   Fecha de Inicio: 07 de Junio 2021
   Fecha de finalización: 12 de Junio 2021
 */

package Controlador;

import Vistas.Splash;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

public class Principal {

    public static void main(String[] args) {
        //Se ejecuta el programa  con un splash en el inicio,para luego mostrar el menú
        new Thread(new Splash()).start();
    }

}
