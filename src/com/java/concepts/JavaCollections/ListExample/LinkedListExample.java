package com.java.concepts.JavaCollections.ListExample;

import com.harsh.collections.JavaIterators.IteratorsExample;

import java.util.*;

/*
LinkedList--->AbstractSequentialList(class)---->List(interface)
LinkedList--->Dequeue(interface)---->Queue(interface)

next →← prev
Java LinkedList class
Java LinkedList class hierarchy
Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

The important points about Java LinkedList are:

Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.
Hierarchy of LinkedList class
As shown in the above diagram, Java LinkedList class extends AbstractSequentialList class and implements List and Deque interfaces.

next →← prev
Java LinkedList class
Java LinkedList class hierarchy
Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

The important points about Java LinkedList are:

Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.

 */
public class LinkedListExample {

    public void func1(){
        LinkedList<Integer> ls=new LinkedList();
        /*
          have all function that list have
         */

        ls.addFirst(1);
        ls.addLast(10);
        ls.getFirst();  //throw exception
        ls.getLast(); //throw exception
        ls.removeFirst(); //throw exception
        ls.removeLast(); //throw exception
        ls.remove(Integer.valueOf(2));//boolean
        ls.remove(2); //return value
        ls.remove();
        ls.removeFirstOccurrence(Integer.valueOf(2));//boolean
        ls.removeLastOccurrence(Integer.valueOf(2));//boolean
        ls.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        ls.size();
        ls.contains(Integer.valueOf(3));
        ls.isEmpty();


       boolean status= ls.offerFirst(2);//return boolean
       status=ls.offerLast(11);//return boolean
       ls.peekFirst();  //throw null;
        ls.peekLast();//throw null;
        ls.pollFirst();//throw null;
        ls.pollLast();//throw null;

        ls.push(2);
       int val= ls.pop();



    }


    public void func2LisIterator(){
        Iterator descItr= new LinkedList<Integer>().descendingIterator();
        ListIterator<Integer> lsItr= Arrays.asList(1,2,3,4,5).listIterator();
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

}
