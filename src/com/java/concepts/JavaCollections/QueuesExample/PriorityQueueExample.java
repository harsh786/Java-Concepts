package com.java.concepts.JavaCollections.QueuesExample;

import java.util.Iterator;
import java.util.PriorityQueue;

/*
Java Queue interface orders the element in FIFO(First In First Out) manner.
In FIFO, first element is removed first and last element is removed at last.
boolean add(object)	It is used to insert the specified element into this queue and return true upon success.
boolean offer(object)	It is used to insert the specified element into this queue.
Object remove()	It is used to retrieves and removes the head of this queue.
Object poll()	It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
Object element()	It is used to retrieves, but does not remove, the head of this queue.
Object peek()	It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.


The PriorityQueue class provides the facility of using queue.
But it does not orders the elements in FIFO manner. It inherits AbstractQueue class.

public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable
PriorityQueue---------->Queue---->collection
 */
public class PriorityQueueExample {


    public void func1(){
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>();

        priorityQueue.add(1);
        priorityQueue.offer(2);
        priorityQueue.poll();
        priorityQueue.peek();
        priorityQueue.remove(Integer.valueOf(2));
        priorityQueue.remove();//throw exception
        priorityQueue.isEmpty();
       Iterator<Integer> itr=priorityQueue.iterator();

    }
}
