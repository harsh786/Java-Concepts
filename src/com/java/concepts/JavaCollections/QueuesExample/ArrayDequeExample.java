package com.java.concepts.JavaCollections.QueuesExample;

import java.util.ArrayDeque;

/*
boolean add(object)	It is used to insert the specified element into this deque and return true upon success.
boolean offer(object)	It is used to insert the specified element into this deque.
Object remove()	It is used to retrieves and removes the head of this deque.
Object poll()	It is used to retrieves and removes the head of this deque, or returns null if this deque is empty.
Object element()	It is used to retrieves, but does not remove, the head of this deque.
Object peek()	It is used to retrieves, but does not remove, the head of this deque, or returns null
if this deque is empty.

The ArrayDeque class provides the facility of using deque and resizable-array. It inherits AbstractCollection class and implements the Deque interface.

Unlike Queue, we can add or remove elements from both sides.
Null elements are not allowed in the ArrayDeque.
ArrayDeque is not thread safe, in the absence of external synchronization.
ArrayDeque has no capacity restrictions.
ArrayDeque is faster than LinkedList and Stack.

Key differences:

The ArrayDeque class is the resizable array implementation of the Deque interface and LinkedList class is the list implementation

NULL elements can be added to LinkedList but not in ArrayDeque

ArrayDeque is more efficient than the LinkedList for add and remove operation at both ends and LinkedList implementation is efficient for removing the current element during the iteration

The LinkedList implementation consumes more memory than the ArrayDeque

So if you don't have to support NULL elements && looking for less memory && efficiency of add/remove elements at both ends, ArrayDeque is the best
ArrayDequeue--------->Dequeue-------->Queue------>collection

*/
public class ArrayDequeExample {

    public void func1(){
        ArrayDeque<Integer> que=new ArrayDeque<>();
        /*

            same as linked list function
         */
    }
}
