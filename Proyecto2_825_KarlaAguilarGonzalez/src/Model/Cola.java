package Model;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class Cola {

    //DECLARACIÓN DE ATRIBUTOS
    private Nodo primero;
    private Nodo ultimo;
    private int size;

    //CONSTRUCTOR SIN PARÁMETROS
    public Cola() {
        primero = null;
        ultimo = null;
        size = 0;
    }

    //MÉTODO PARA VACIAR LA COLA
    public void EmptyQueue() {
        primero = null;
        ultimo = null;
        size = 0;
    }

    //MÉTODO PARA CONSULTAR SI LA COLA ESTÁ VACÍA
    public boolean isEmpty() {
        return size == 0;
    }

    //MÉTODO PARA OBTENER EL TAMAÑO ACTUAL DE LA COLA
    public int getSize() {
        return size;
    }

    //MÉTODO PARA INSERTAR ELEMENTOS EN LA COLA
    public void Push(int numero) {
        Nodo nuevo = new Nodo(numero);

        if (this.isEmpty()) {
            primero = nuevo;
            ultimo = nuevo;
            size++;
            return;
        }

        ultimo.setSiguiente(nuevo);
        ultimo = nuevo;
        size++;
    }

    //MÉTODO PARA EXTRAER UN ELEMENTO DE LA COLA
    public int Remove() {
        int numero = primero.getDato();
        primero = primero.getSiguiente();

        size--;

        return numero;
    }

    //MÉTODO PARA RETORNAR UNA POSICIÓN EN ESPECÍFICO EN LA COLA 
    public Nodo get(int i) {
        if (i > this.size - 1 || i < 0) {
            return null;
        }

        Nodo aux = primero;

        for (int j = 0; j < i; j++) {
            aux = aux.getSiguiente();
        }

        return aux;
    }

    public void imprimir() {
        Nodo reco = primero;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco != null) {
            System.out.print(reco.getSiguiente().getDato() + "-");
            reco = reco.getSiguiente();
        }
        System.out.println();
    }

    //MÉTODO PARA OBTENER UN ELEMENTO EN UNA DETERMINADA POSICIÓN
    public void getPositionValue(int posicion) {
        // Verificamos si la posición ingresada se encuentra en el rango >= 0 y < que el número de elementos del la cola.
        if (posicion >= 0 && posicion < size) {
            if (posicion == 0) {
                // Se muestra el valor del elemento en el inicio de la cola.
                JOptionPane.showMessageDialog(null, "El elemento encontrado en la posición " + posicion + " es = " + primero.getDato());
            } else {
                // Crea una copia de la lista.
                Nodo aux = primero;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                // Muestra el valor del elemento en la cola.
                JOptionPane.showMessageDialog(null, "El elemento encontrado en la posición " + posicion + " es = " + aux.getDato());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error,esa posición no existe en la lista!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //MÉTODO PARA MOSTRAR GRÁFICAMENTE LOS ELEMNTOS QUE SE ENCUENTRAN EN LA LISTA ENLAZADA DE TIPO COLA
    public void ShowQueue(JPanel MyPanel) {
        //Creamos 2 íconos 
        ImageIcon butterfly = new javax.swing.ImageIcon(getClass().getResource("/Images/butterfly_icon.png"));
        ImageIcon flecha = new javax.swing.ImageIcon(getClass().getResource("/Images/flecha_graph.png"));

        MyPanel.setBackground(new Color(0, 0, 0, 0));//Agreagmos transparencia al panel
        MyPanel.removeAll();//Limpiamos el panel  
        MyPanel.setVisible(true);
        //Creamos JLabels
        JLabel tag_Inicio = new JLabel();
        JLabel tag_OnFlecha = new JLabel();
        JLabel tag_FIN = new JLabel();

        tag_Inicio.setText("INICIO"); //Agregamos texto       
        tag_FIN.setText("FIN"); //Agregamos texto     
        tag_OnFlecha.setIcon(flecha); //Agregamos el ícono de la flecha al JLabel

        //Si no hay elementos en la cola, no mostramos nada en el JPanel
        if (size == 0) {
            tag_Inicio.setText(""); //Limpiamos el texto del JLabel
            tag_FIN.setText(""); //Limpiamos el texto del JLabel
            tag_OnFlecha.setVisible(false); //Ocultamos el JLabel que tiene el icono de la flecha
        }

        MyPanel.add(tag_Inicio); //Agregamos el Jlabel con el texto "INICIO" al JPanel

        for (int i = 0; i < this.size; i++) {
            //Vamos a ir creando de manera dinámica Jlabels para mostrar el elemento en la cola 
            JLabel tag = new JLabel();
            JLabel tag_flecha = new JLabel();

            tag.setIcon(butterfly); //Agregamos el ícono de la mariposa al JLabel
            tag.setText("" + this.get(i).getDato()); //Agregamos el valor de cada elemento en el JLabel que le asignamos un icono
            tag_flecha.setIcon(flecha);//Agregamos de la Flecha de la mariposa al JLabel

            //Personalizamos todos los JLabels a la misma vez
            JLabel mytags[] = {tag_Inicio, tag_OnFlecha, tag_FIN, tag, tag_flecha};
            Funciones.ModificarTags(mytags);

            MyPanel.add(tag_flecha); //Agregamos el JLabel que tiene como ícono la flecha al JPanel
            MyPanel.add(tag);//Agregamos el JLabel que contiene el ícono de la mariposa y el valor de cada nodo en la cola al JPanel
        }

        MyPanel.add(tag_OnFlecha); //Agregamos el JLabel que tiene como ícono la flecha al JPanel
        MyPanel.add(tag_FIN); //Agregamos el Jlabel con el tecto "FIN" al JPanel

    }

    //MÉTODO PARA MOSTRAR GRÁFICAMENTE LOS ELEMNTOS QUE SE ENCUENTRAN EN LA LISTA ENLAZADA DE TIPO COLA
    public void Mostrar(JList miLista) {

        DefaultListModel modelo = new DefaultListModel();
        miLista.setModel(modelo);
        //Si no hay elementos en la cola, no mostramos nada
        if (size == 0) {
            modelo.clear();
        } else {
            modelo.clear();
            for (int i = 0; i < this.size; i++) {
                modelo.addElement("Dato: " + this.get(i).getDato());
            }
            miLista.setModel(modelo);
        }
    }

}
