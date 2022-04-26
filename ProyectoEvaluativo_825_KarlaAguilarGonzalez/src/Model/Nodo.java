
package Model;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class Nodo {
    private Integer Valor;
    private Nodo Izquierda;
    private Nodo Derecha;

    public Nodo(Integer Valor, Nodo Izquierda, Nodo Derecha) {
        this.Valor = Valor;
        this.Izquierda = Izquierda;
        this.Derecha = Derecha;
    }

    public Nodo() {
    }

    public Integer getValor() {
        return Valor;
    }

    public void setValor(Integer Valor) {
        this.Valor = Valor;
    }

    public Nodo getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo Izquierda) {
        this.Izquierda = Izquierda;
    }

    public Nodo getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo Derecha) {
        this.Derecha = Derecha;
    }

  
    
    
}
