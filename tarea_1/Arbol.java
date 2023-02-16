public class Arbol {
    private Nodo raiz;
    public Arbol(){
        this.raiz = null;
    }
    public Arbol(Object dato){
        raiz = new Nodo(dato);
    }
}
