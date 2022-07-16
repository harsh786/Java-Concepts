package JavaConcepts.GenericsConcepts;

import java.io.Serializable;
import java.util.*;

public class GenericsExample {

    public  static void main(String[]args){
        List<? extends Number> list1 = new ArrayList<Integer>();
        list1.add(null);  //OK
        Number n = list1.get(0);  //OK
        Serializable s = list1.get(0);  //OK
        Object o = list1.get(0);  //OK
//        Integer o1 =  list1.get(0);  //OK

      /*  list1.add(2.3);  //ERROR
        list1.add(5);  //ERROR
        list1.add(new Object());  //ERROR
        Integer i = list1.get(0);  //ERROR*/




        List<? super Number> list2 = new ArrayList<Number>();
        list2.add(null);  //OK
        list2.add(2.3);  //OK
        list2.add(5);  //OK
        Object o1 = list2.get(0);  //OK

      /*  list2.add(new Object());  //ERROR
        Number n1 = list2.get(0);  //ERROR
        Serializable s1 = list2.get(0);  //ERROR
        Integer i1 = list2.get(0);  //ERROR*/
    }

}
