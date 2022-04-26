package Model;

import javax.swing.JTextArea;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class ArbolBinarioBusqueda {

    private Nodo nod_raiz;
    int altura;

    public ArbolBinarioBusqueda() {

    }
    
    //Agregar datos
    public void Add(int dato) {
        if (dato == 0) {

        } else {

        }
        Nodo nuevo = new Nodo(dato, null, null);
        Insert(nuevo, nod_raiz);
    }

    public void Insert(Nodo nuevo, Nodo pivote) {
        if (this.nod_raiz == null) {
            nod_raiz = nuevo;
        } else {
            if (nuevo.getValor() <= pivote.getValor()) {
                if (pivote.getIzquierda() == null) {
                    pivote.setIzquierda(nuevo);
                } else {
                    Insert(nuevo, pivote.getIzquierda());
                }
            } else {
                if (pivote.getDerecha() == null) {
                    pivote.setDerecha(nuevo);
                } else {
                    Insert(nuevo, pivote.getDerecha());
                }
            }
        }
    }

    //Imprimir preorden
    public void Imprimir_PreOrden(JTextArea MyTexto) {
        PreOrden(nod_raiz, MyTexto);
    }

    private void PreOrden(Nodo nodo_recorrer, JTextArea MyTexto) {
        if (nodo_recorrer != null) {
            MyTexto.append(nodo_recorrer.getValor() + " -> ");
            PreOrden(nodo_recorrer.getIzquierda(), MyTexto);
            PreOrden(nodo_recorrer.getDerecha(), MyTexto);
        }
    }

    //Imprimir InOrden
    public void Imprimir_InOrden(JTextArea MyTexto) {
        InOrden(nod_raiz, MyTexto);
    }

    private void InOrden(Nodo nodo_recorrer, JTextArea MyTexto) {
        if (nodo_recorrer != null) {
            InOrden(nodo_recorrer.getIzquierda(), MyTexto);
            MyTexto.append(nodo_recorrer.getValor() + " -> ");
            InOrden(nodo_recorrer.getDerecha(), MyTexto);
        }
    }

//imprimir post orden
    public void Imprimir_PosOrden(JTextArea MyTexto) {
        PosOrden(nod_raiz, MyTexto);
    }

    private void PosOrden(Nodo nodo_recorrer, JTextArea MyTexto) {
        if (nodo_recorrer != null) {
            PosOrden(nodo_recorrer.getIzquierda(), MyTexto);
            PosOrden(nodo_recorrer.getDerecha(), MyTexto);
            MyTexto.append(nodo_recorrer.getValor() + " -> ");
        }
    }

    //Altura arbol
    public int AlturaArbol() {
        altura = 0;
        CalcularAltura(nod_raiz, 1);
        return altura;
    }

    private void CalcularAltura(Nodo pivote, int nivel) {
        if (pivote != null) {
            CalcularAltura(pivote.getIzquierda(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            CalcularAltura(pivote.getDerecha(), nivel + 1);
        }
    }
}


