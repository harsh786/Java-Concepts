package JavaConcepts.JavaCollections.ListExample;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/*
Arraylist is a class inherit from --->>>list interface ->>>Collection interface


1) ArrayList is not synchronized.	Vector is synchronized.
2) ArrayList increments 50% of current array size if the number of elements exceeds from its capacity.
Vector increments 100% means doubles the array size if the total number of elements exceeds than its capacity.
3) ArrayList is not a legacy class. It is introduced in JDK 1.2.
	Vector is a legacy class.
4) ArrayList is fast because it is non-synchronized.
Vector is slow because it is synchronized, i.e., in a multithreading environment, it holds the other threads in runnable or non-runnable state until current thread releases the lock of the object.
5) ArrayList uses the Iterator interface to traverse the elements.
A Vector can use the Iterator interface or Enumeration interface to traverse the elements.


 */
public class ArrayListExample {

    public void func1(){
        List<Integer> ls=new ArrayList<>();
        ls.toArray();
        ls.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1.compareTo(o2);
            }
        });

        boolean valid=ls.remove(Integer.valueOf("2"));
        int val=ls.remove((3));
        ls.indexOf(Integer.valueOf(2));
        ls.lastIndexOf(2);
        ls.isEmpty();
        ls.size();
       int prevele= ls.set(2,4);
       ls.add(4,5);
       ls.addAll(4, Arrays.asList(4,5));
       ls.contains(2);
       ls.containsAll(Arrays.asList(4,5));
       ls.clear();
        val=ls.get(4);
        List<Integer>ls1=ls.subList(3,9);

    }

    public void func2ListIterator(){
        ListIterator<Integer>lsItr= Arrays.asList(1,2,3,4,5).listIterator();
        lsItr.add(6);
        lsItr.hasNext();
        lsItr.hasPrevious();
        lsItr.next();
        lsItr.previous();
        lsItr.previousIndex();
        lsItr.nextIndex();
        lsItr.remove();
        lsItr.set(4);
    }
/*
This is a very useful construct in the multi-threaded programs
– when we want to iterate over a list in a thread-safe way without an explicit synchronization.
A thread-safe variant of ArrayList in which all mutative operations (add, set, and so on) are implemented by making a fresh copy of the underlying array.
Normally CopyOnWriteArrayList is very expensive because it involves costly Array copy with every writes operation but it's very efficient if you have a List where Iteration outnumbers mutation e.g.
 you mostly need to iterate the ArrayList and don't modify it too often.

 */
    public void func3(){
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();//syncronize



    }



}
