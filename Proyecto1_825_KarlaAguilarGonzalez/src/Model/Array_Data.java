package Model;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

public class Array_Data {
    
    //Atributos de la clase
    private double[] ListaAleatoria = new double[1000];
    private double[] ArrayOB = new double[1000];
    private double[] ArrayOS = new double[1000];
    private double[] ArrayOQ = new double[1000];

    //Constructor vacío
    public Array_Data() {
    }

    //Constructor con parámetros
    public Array_Data(double[] ListaAleatoria, double[] ArrayOB, double[] ArrayOS, double[] ArrayOQ) {
        this.ListaAleatoria = new double[1000];
        this.ArrayOB = new double[1000];
        this.ArrayOQ = new double[1000];
        this.ArrayOS = new double[1000];
    }

    //Get and Setter de cada atributo de la clase
    public double[] getListaAleatoria() {
        return ListaAleatoria;
    }

    public void setListaAleatoria(double[] ListaAleatoria) {
        this.ListaAleatoria = ListaAleatoria;
    }

    public double[] getArrayOB() {
        return ArrayOB;
    }

    public void setArrayOB(double[] ArrayOB) {
        this.ArrayOB = ArrayOB;
    }

    public double[] getArrayOS() {
        return ArrayOS;
    }

    public void setArrayOS(double[] ArrayOS) {
        this.ArrayOS = ArrayOS;
    }

    public double[] getArrayOQ() {
        return ArrayOQ;
    }

    public void setArrayOQ(double[] ArrayOQ) {
        this.ArrayOQ = ArrayOQ;
    }

}
