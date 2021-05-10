package com.java.concepts.JavaCollections.ListExample;

import java.util.Stack;
/*
The stack is a linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO). Java collection framework provides many interfaces and classes to store the collection of objects. One of them is the Stack class that provides different operations such as push, pop, search, etc.

In this section, we will discuss the Java Stack class, its methods, and implement the stack data structure in a Java program. But before moving to the Java Stack class have a quick view of how the stack works.

The stack data structure has the two most important operations that are push and pop. The push operation inserts an element into the stack and pop operation removes an element from the top of the stack. Let's see how they work on stack.
In Java, Stack is a class that falls under the Collection framework that extends the Vector class. It also implements interfaces List, Collection, Iterable, Cloneable, Serializable. It represents the LIFO stack of objects. Before using the Stack class, we must import the java.util package. The stack class arranged in the Collections framework hierarchy, as shown below.
 class Stack<E> extends Vector<E> {

 */
public class StackExample {

    public void func1(){
        Stack<Integer>st=new Stack<Integer>();

        st.push(1);
        st.peek();
        st.empty();
        st.pop();
        st.search(Integer.valueOf(2));
        st.isEmpty();
        st.capacity();

    }
}
