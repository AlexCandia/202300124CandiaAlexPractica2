
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{   
    public static void main (String []args){
      ListaCSE<Integer> lis =new ListaCSE<Integer>();
      lis.insertar(1);
      lis.insertar(2);
      lis.insertar(3);
      lis.swap(3,1);
      String lista=lis.print();
      System.out.println(lista);
    }
    
}
