package Clases_Funciones;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class Funciones_Numero {

    //*** Método Recursivo para Sumar los dígitos del número ingresado por el usuario***//
    public static int SumaDigitos(int MyNumero) {
        if (MyNumero == 0) {
            return 0;
        } else {
            return SumaDigitos(MyNumero / 10) + MyNumero % 10;
        }
    }

    // ** Método Recursivo para Invertir los dígitos del número ingresado por el usuario*** //
    public static String InvertirDigitos(String DigitosNum) {
        if (DigitosNum.length() == 1) {
            return DigitosNum;
        }
        return InvertirDigitos(DigitosNum.substring(1)) + DigitosNum.charAt(0);
    }
}
