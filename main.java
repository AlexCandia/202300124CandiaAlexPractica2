
public class main
{
    public static void main(String []args){
        Tree<Character> arbol = new Tree<Character>();
        arbol.insertarSimple('c');
        arbol.insertarSimple('a');
        arbol.insertarSimple('u');
        arbol.insertarSimple('h');
        arbol.insertar('a','t');
        arbol.insertar('t','s');
        arbol.insertar('u','t');
        arbol.insertar('h','e');
        arbol.insertar('h','u');
        ListaSE<Character> ruta = new ListaSE<Character>();
        ruta.insertar('c');
        ruta.insertar('u');
        ruta.insertar('t');
        arbol.insertarRuta('p',ruta);
        ruta.insertar('c');
        ruta.insertar('u');
        ruta.insertar('t');
        arbol.insertarRuta('e',ruta);
        ruta.vaciar();
        ruta.insertar('c');
        ruta.insertar('h');
        ruta.insertar('u');
        arbol.insertarRuta('i',ruta);
        ruta.insertar('c');
        ruta.insertar('h');
        ruta.insertar('u');
        arbol.insertarRuta('s',ruta);
        arbol.mirarArbol();
    }
}
