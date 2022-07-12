package JavaConcepts.JavaIterators;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorsExample {

    /*
    Iterator is a interface
    It is the first interface in collection


     */

    public IteratorsExample(){

    }

    public void func1(){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
       //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        itr.remove();
    }


}
