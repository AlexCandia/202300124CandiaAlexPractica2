
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
      /*lis.insertar(7);
      lis.insertar(3);
      lis.insertar(4);
      lis.insertar(5);
      lis.insertar(0);
      lis.insertar(2);
      lis.insertar(8);
      lis.swap(1,6);
      String lista=lis.print();
      System.out.println(lista);
      lis.swap(0,0);
      lista=lis.print();
      System.out.println(lista);
      lis.swap(0,6);
      lista=lis.print();
      System.out.println(lista);
      lis.swap(1,0);
      lista=lis.print();
      System.out.println(lista);
      lis.swap(0,1);
      lista=lis.print();
      System.out.println(lista);*/
      lis.insertar(3);
      lis.insertar(2);
      lis.insertar(4);
      lis.insertar(1);
      lis.swap(0,3);
      String lista=lis.print();
      System.out.println(lista);
      lis.swap(2,3);
      lista=lis.print();
      System.out.println(lista);
      lis.swap(1,1);
      lista=lis.print();
      System.out.println(lista);
      lis.swap(2,2);
      lista=lis.print();
      System.out.println(lista);
      lis.swap(0,3);
      lista=lis.print();
      System.out.println(lista);
    }
    
}
