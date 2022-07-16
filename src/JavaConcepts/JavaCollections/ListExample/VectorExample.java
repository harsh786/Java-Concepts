package JavaConcepts.JavaCollections.ListExample;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
/*

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
public class VectorExample {

  public void func1() {
    Vector<Integer> vc = new Vector<>();
    boolean status = vc.add(1);
    vc.add(1, 2);
    vc.addAll(Arrays.asList(1, 2, 3, 4));
    vc.addAll(1, Arrays.asList(5, 6, 7, 8));
    vc.clear();
    vc.contains(3);
    vc.containsAll(Arrays.asList(1, 2, 3, 4));
    vc.capacity();
    vc.elementAt(2);
    vc.get(2);
    vc.clone();
    vc.indexOf(2, 7);
    vc.setElementAt(2, 10);
    vc.set(2, 20);
  }

  public void func2VectorIterator() {
    ListIterator<Integer> lsItr = new Vector(Arrays.asList(1, 2, 3, 4, 5)).listIterator();
    ListIterator<Integer> lsItr1 =
        new Vector(Arrays.asList(1, 2, 3, 4, 5)).listIterator(3); // 3 index
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
