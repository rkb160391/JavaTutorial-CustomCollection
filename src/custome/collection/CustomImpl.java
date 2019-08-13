package custome.collection;
import java.util.*;

  public class CustomImpl{
   public static void main(String[] args) {
        try{
      String s[]={"My", "Custom", "Implementation"};
      Object o;
      int i=0;
      MyClassImpl a= new MyClassImpl();
      List lst=a.myList(s);
      System.out.println("The list is: "+lst);
      MyArrayList al=new MyArrayList(s);
      o=al.get(1);
      System.out.println("The retrieved element is: "+o);
      String s1="Collection";
      o=al.set(2,s1);
      System.out.println("The set element in place of Implementation is: "+s1);
      System.out.println("Now the new list is: "+lst);
      i=al.size();
      System.out.println("The size of the array list is: "+i);
      }
      catch(Exception e){}
    }
    }