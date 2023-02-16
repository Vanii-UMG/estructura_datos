public class Nodo{
    private Object dato;
    private Nodo izquierdo;
    private Nodo derecho;
    public Nodo(Object dato){
        this.dato = dato;
        izquierdo = null;
        derecho = null;
    }
    public Nodo(Object dato, Nodo izquierdo, Nodo derecho){
        this.dato = dato;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

}