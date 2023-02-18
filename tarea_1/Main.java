
    public class Main{
        public static void main(String[] args) {
    
            /* Pruebas  para recorrer en InOrden*/
            Arbol arbol = new Arbol();
            arbol.insertar(4,"100");
             arbol.insertar(8,"200");
             arbol.insertar(1,"300");
             arbol.insertar(9,"400");
             arbol.insertar(7,"500");
         
            arbol.recorrer(arbol.raiz);
        }
    }
