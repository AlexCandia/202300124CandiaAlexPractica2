import java.util.ArrayList;

public class Tree<T>
{
    public T data;
    public ArrayList<Tree<T>> childs;
    public Tree(){
        data=null;
        childs=new ArrayList<Tree<T>>();
    }
    private Tree(T data){
        this.data=data;
        childs=new ArrayList<Tree<T>>();
    }
    public boolean vacia(){
        return data==null;
    }
    public void insertarSimple(T data){
        if(vacia()){
            this.data=data;
        }else{
            childs.add(new Tree<T>(data));
        }
    }
    public void insertar(T padre,T hijo){
        Cola<Tree<T>> cola;
        cola = new Cola<Tree<T>>();
        cola.encolar(this);
        insertar(padre,hijo, cola);
    }
    private void insertar(T padre,T hijo, Cola<Tree<T>> cola){
        Tree<T> arb;
        arb = cola.decolar();
        if(!arb.vacia()){
           int largo=arb.childs.size()-1;
           if(arb.data==padre){
               arb.insertarSimple(hijo);
           }else{
               for(int i=0;i<=largo;i++){
                  cola.encolar(arb.childs.get(i));
               }
               insertar(padre,hijo,cola);
           }
        }
    }
    public void insertarRuta(T dato,ListaSE<T> ruta){
        Cola<Tree<T>> cola =new Cola<Tree<T>>();
        cola.encolar(this);
        insertarRuta(dato,ruta,cola);
    }
    private void insertarRuta(T dato,ListaSE<T> ruta,Cola<Tree<T>> cola){
        T r1;
        Tree<T> arb;
        arb=cola.decolar();
        if(arb.vacia()){
            if(ruta.vacia()){
                arb.data=dato;
            }
        }else{
            r1=ruta.acceder(0);
            if(r1.equals(arb.data)){
               ruta.eliminar(0);
               if(ruta.vacia()){
                  arb.childs.add(new Tree<T>(dato));  
               }else{
                   for(int i=0;i<=arb.childs.size()-1;i++){
                    cola.encolar(arb.childs.get(i));
                    }
                   insertarRuta(dato,ruta,cola);
               }
            }else{
               insertarRuta(dato,ruta,cola);
            }
        } 
    }
    public void mirarArbol() {
        Cola<Tree<T>> cola = new Cola<Tree<T>>();
        cola.encolar(this);
        mirarArbol(cola);
    }

    private void mirarArbol(Cola<Tree<T>> cola) {
        while (!cola.vacia()) {
            int nodosEnNivel = cola.size();

            for (int i = 0; i < nodosEnNivel; i++) {
                Tree<T> arb = cola.decolar();
                System.out.print(arb.data + " ");

                for (Tree<T> child : arb.childs) {
                    cola.encolar(child);
                }
            }

            System.out.println();
        }
    }
} 
