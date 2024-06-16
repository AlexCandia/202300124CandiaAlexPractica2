
/**
 * Write a description of class NodoSE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodoSE<Integer>
{
    private int         dato;
    private NodoSE<Integer> suc;
    public NodoSE(int dato){
        this.dato=dato;
        suc=null;
    }
    public NodoSE<Integer> getSuc(){
        return suc;
    }
    public int getDato(){
        return dato;
    }
    public void setSuc(NodoSE<Integer> suc){
        this.suc=suc;
    }
    public void setDato(int dato){
        this.dato=dato;
    }
}
