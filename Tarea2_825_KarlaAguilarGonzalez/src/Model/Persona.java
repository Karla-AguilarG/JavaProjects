package Model;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

public class Persona {

//=================================================================//
//---------DECLARACIÓN DE ATRIBUTOS DE LA CLASE PERSONA-----------//
    private int Identificacion;
    private int Edad;
//=========================================================================//
//---------DECLARACIÓN DE ARREGLOS DE TIPO OBJETO(PERSONA) QUE CONTIENEN--//
//---------COMO ATRIBUTOS LA IDENTIFICACIÓN Y EDAD -----------------------//
    private Persona[] Lista_Todos = new Persona[50];
    private Persona[] Pila_Menores = new Persona[50];
    private Persona[] Pila_Adultos = new Persona[50];
    private Persona[] Pila_AdlMayores = new Persona[50];
    
    //CONSTRUCTOR
    public Persona() {
        this.Identificacion = 0;
        this.Edad = 0;
        this.Lista_Todos = new Persona[50];
        this.Pila_Menores = new Persona[50];
        this.Pila_Adultos = new Persona[50];
        this.Pila_AdlMayores = new Persona[50];
    }

    public Persona(int Identificacion, int Edad) {
        this.Identificacion = Identificacion;
        this.Edad = Edad;
    }

    
 //GET AND SETTER DE LA IDENTIFICACIÓN Y EDAD
    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Identificación : " + Identificacion + " - Edad: " + Edad;
    }

    // GET AND SETTER DE LOS ARREGLOS DE TIPO OBJETO(PERSONA)
    public Persona[] getLista_Todos() {
        return Lista_Todos;
    }

    public void setLista_Todos(Persona[] Lista_Todos) {
        this.Lista_Todos = Lista_Todos;
    }

    public Persona[] getPila_Menores() {
        return Pila_Menores;
    }

    public void setPila_Menores(Persona[] Pila_Menores) {
        this.Pila_Menores = Pila_Menores;
    }

    public Persona[] getPila_Adultos() {
        return Pila_Adultos;
    }

    public void setPila_Adultos(Persona[] Pila_Adultos) {
        this.Pila_Adultos = Pila_Adultos;
    }

    public Persona[] getPila_AdlMayores() {
        return Pila_AdlMayores;
    }

    public void setPila_AdlMayores(Persona[] Pila_AdlMayores) {
        this.Pila_AdlMayores = Pila_AdlMayores;
    }

}
