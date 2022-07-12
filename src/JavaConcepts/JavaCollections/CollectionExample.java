package JavaConcepts.JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
Collection is an interface
iterator---> collection

The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

 */
public class CollectionExample {
    public CollectionExample(){

    }

    public void func1(){
        Collection<String> cl=new ArrayList<String>();
        cl.add("1");
        cl.addAll(Arrays.asList("2","3"));

        String[] str=new String[]{"1","2"};
        cl.addAll(Arrays.asList(str));
        cl.addAll(new ArrayList(Arrays.asList(new String[]{"4","5"})));
        cl.clear();
        cl.contains("2");
        cl.containsAll(Arrays.asList("2","3"));
        cl.isEmpty();
        cl.iterator();
        cl.remove("2");
        cl.removeAll(new ArrayList(Arrays.asList(new String[]{"4","5"})));
        cl.removeIf(x->x.contains("2"));
        cl.size();
         String[] str1=  cl.toArray(str);

    }
}
