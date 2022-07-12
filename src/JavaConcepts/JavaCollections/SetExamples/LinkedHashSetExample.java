package JavaConcepts.JavaCollections.SetExamples;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. It inherits HashSet class and implements Set interface.

        The important points about Java LinkedHashSet class are:

        Java LinkedHashSet class contains unique elements only like HashSet.
        Java LinkedHashSet class provides all optional set operation and permits null elements.
        Java LinkedHashSet class is non synchronized.
        Java LinkedHashSet class maintains insertion order.

LinkedhashSet-------->HashSet------>AbstractSet------>Set----->Collection------>Iterable
public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable

HashSet()	It is used to construct a default HashSet.
HashSet(Collection c)	It is used to initialize the hash set by using the elements of the collection c.
LinkedHashSet(int capacity)	It is used initialize the capacity of the linked hash set to the given integer value capacity.
LinkedHashSet(int capacity, float fillRatio)	It is used to initialize both the capacity and the fill ratio (also called load capacity) of the hash set from its argument.
        *
 */
public class LinkedHashSetExample {

    public void func1(){
        LinkedHashSet<Integer>hs=new LinkedHashSet<>();
        LinkedHashSet<Integer> hs1=new LinkedHashSet<>(Arrays.asList(1,2,3));
        hs.add(1);
        hs.clear();
        hs.clone();
        hs.contains(2);
        hs.isEmpty();
        hs.size();
        hs.remove(Integer.valueOf(2));
        hs.toArray();
        hs.addAll(Arrays.asList(4,5,6));
        hs.containsAll(Arrays.asList(4,5,6));
        Iterator itr= hs.iterator();

        for(Integer i :hs){
            System.out.println(i);
        }
    }
}
