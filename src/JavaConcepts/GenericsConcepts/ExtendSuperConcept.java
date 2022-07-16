package JavaConcepts.GenericsConcepts;


import java.util.*;
import java.util.ArrayList;

class A { }
class B extends A { }
class C extends B { }
public class ExtendSuperConcept {

    public  static void main(String[]args){

        /*this is to understand the extend in generics*/
        List<? extends C>extC1=new ArrayList<C>();
        extC1.add(new C());

        List<? extends B>extB1=new ArrayList<C>();
        extB1.add(new C());
        extB1.add(new A());
        extB1.add(new B());

       A a1= extC1.get(0);
       B a2= extC1.get(0);
       C a3= extC1.get(0);

       B b1=extB1.get(0);
       C b2=extB1.get(0);
       A b3=extB1.get(0);


        /*this is to understand the super in generics*/
        List<? super C>supC1=new ArrayList<C>();
        supC1.add(new C());
        supC1.add(new B());

        List<? super A>supB1=new ArrayList<A>();
        supB1.add(new B());
        supB1.add(new A());
        supB1.add(new C());

        A supa1= supC1.get(0);
        B supa2= supC1.get(0);

        B supb1=supB1.get(0);
        C supb2=supB1.get(0);
        A supb3=supB1.get(0);

    }


}
