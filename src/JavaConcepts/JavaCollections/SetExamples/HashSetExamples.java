package JavaConcepts.JavaCollections.SetExamples;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/*
Java HashSet class is used to create a collection that uses a hash table for storage.
It inherits the AbstractSet class and implements Set interface.

The important points about Java HashSet class are:

HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.


The HashSet class extends AbstractSet class which implements Set interface.
The Set interface inherits Collection and Iterable interfaces in hierarchical order.

public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable

 */
public class HashSetExamples {

    public void func1(){
        HashSet<Integer>hs=new HashSet<>();
        HashSet<Integer>hs1=new HashSet<>(Arrays.asList(1,2,3));
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
    /*
    A CopyOnWriteArraySet that uses an internal CopyOnWriteArrayList for all of its operations.
     Thus, it shares the same basic properties:
It is best suited for applications in which set sizes generally stay small,
read-only operations vastly outnumber mutative operations, and you need to prevent interference among threads during traversal.
It is thread-safe.
Mutative operations (add, set, remove, etc.) are expensive since
they usually entail copying the entire underlying array.
Iterators do not support the mutative remove operation.
Traversal via iterators is fast and cannot encounter interference from other threads.
Iterators rely on unchanging snapshots of the array at the time the iterators were constructed.


     */
    public void func2(){
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

    }
}
