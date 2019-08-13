package custome.collection;

import java.util.List;

class MyClassImpl{
    public static List myList(Object[] a) {
       return new MyArrayList(a);
    }
  }