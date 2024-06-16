public class Cola<T> {
    public NodoDE<T> frente, fin;
    
    public Cola(){
        frente = fin = null;
    }
    
    public boolean vacia(){
        return frente == null;
    }
    
    public void encolar(T dato){
        NodoDE<T> p;
        p = new NodoDE<T>(dato);
        if(vacia()){
            frente = fin = p;
        }else{
            fin.setSuc(p);
            p.setAnt(fin);
            fin = p;
        }
    }
    
    public T decolar(){
        T dato;
        if(vacia()){
            dato = null;
        }else{
            dato = frente.getDato();
            frente = frente.getSuc();
            if(frente == null){
                fin = null;
            }else{
                frente.setAnt(null);
            }
        }
        return dato;
    }
    public void decolar2(){
      if(!vacia()){
      frente = frente.getSuc();
      if(frente == null){
        fin = null;
      }else{
        frente.setAnt(null);
      }
        }
    }
    
    public T ver(){
        T dato;
        if(vacia()){
            dato = null;
        }else{
            dato = frente.getDato();
        }
        return dato;
    }
    public int size(){
        int res;
        if(vacia()){
            res=0;
            return res;
        }else{
            NodoDE<T> p;
            p=frente;
            res=size(p);
            return res;
        }
    }
    private int size(NodoDE<T> p){
        int res;
        if(p.getSuc()==null){
            res=1;
        }else{
            res=1+size(p.getSuc());
        }
        return res;
    }
}
