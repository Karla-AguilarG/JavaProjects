package Model;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

public class Nodo {
    //Declaracion de atributos
    private int dato;
    private Nodo siguiente;

    //CONSTRUCTOR CON PARÁMETRO
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
    //CONSTRUCTOR SIN PARÁMETROS
    public Nodo() {
        this.dato = -1;
        this.siguiente = null;
    }

    //GETTER AND SETTER
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
