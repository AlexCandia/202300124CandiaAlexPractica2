
/**
 * Write a description of class ListaCSE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaCSE<Integer>
{
    private NodoSE<Integer> ini;
    public ListaCSE(){
        ini=null;
    }
    private NodoSE<Integer> buscarNA(NodoSE<Integer> q,NodoSE<Integer> r){
        NodoSE<Integer> res;
        if(r.getSuc().equals(q)){
            res=r; 
        }else{
            res=buscarNA(q,r.getSuc());
        }
        return res; 
    }
    private NodoSE<Integer> buscar(NodoSE<Integer> nodo,int pos){
        NodoSE<Integer> q;
        if(pos==0){
            q=nodo;
        }else{
            q=buscar(nodo.getSuc(),pos-1);
        }
        return q;
    }
    
    public boolean vacia(){
        return ini==null;
    }
    public void insertar(int dato){
        NodoSE<Integer> q,aux;
        q=new NodoSE<Integer>(dato);
        if(ini==null){
            ini=q;
            ini.setSuc(q);
        }else{
            aux=ini;
            while(aux.getSuc()!=ini){
                aux=aux.getSuc();
            }
            aux.setSuc(q);
            q.setSuc(ini);
        }
    }
    public void reemplazar(int datoOR,int datoN){
        NodoSE<Integer> p,q,r,s;
        r=new NodoSE<Integer>(datoN);
        if(!vacia()){
            q=buscar(ini,datoOR);
            p=buscarNA(q,q);
            if(q==ini){
                ini=r;
                s=q.getSuc();
                p.setSuc(r);
                r.setSuc(s);
            }else{
                s=q.getSuc();
                p.setSuc(r);
                r.setSuc(s);
            }   
        }
    }
    public void swap(int pos1,int pos2){
        NodoSE<Integer> p,q,r,s,a,b;
        p=buscar(ini,pos1);
        r=buscar(ini,pos2);
        if(p!=null && r!=null){
            if(p==ini){
                q=buscarNA(p,ini);
                s=buscarNA(r,ini);
                s.setSuc(p);
                q.setSuc(r);
                a=p.getSuc();
                b=r.getSuc();
                p.setSuc(b);
                r.setSuc(a);
                ini=r;
            }else if(r==ini){
                q=buscarNA(p,ini);
                s=buscarNA(r,ini);
                s.setSuc(p);
                q.setSuc(r);
                a=p.getSuc();
                b=r.getSuc();
                p.setSuc(b);
                r.setSuc(a);
                ini=p;
            }else{
                q=buscarNA(p,ini);
                s=buscarNA(r,ini);
                s.setSuc(p);
                q.setSuc(r);
                a=p.getSuc();
                b=r.getSuc();
                p.setSuc(b);
                r.setSuc(a);
        }
    }
    }
    public String print() {
        String res = "";
        if (vacia()) {
            return "Lista Vacia";
        }
        NodoSE<Integer> aux = ini;
        do {
            res +=aux.getDato()+""+" ";
            aux = aux.getSuc();
        } while (!aux.equals(ini));
        return res;
    }
}
