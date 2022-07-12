package JavaConcepts.JavaCollections.SetExamples;

import java.awt.*;
import java.util.EnumSet;

/*
EnumSet is a specialized Set implementation for use with enum types. All of the elements in an enum
set must come from a single enum type that is specified,
explicitly or implicitly, when the set is created. Enum sets are represented internally as bit vectors.
 This representation is extremely compact and efficient.
Space and time performance of this class should be good enough
to allow its use as a high-quality, typesafe alternative to traditional
int-based "bit flags." Even bulk operations (such as containsAll and retainAll)
should run very quickly if their argument is also an enum set.
The iterator returned by the iterator method traverses the elements in their natural order
(the order in which the enum constants are declared).
The returned iterator is weakly consistent: it will never throw
ConcurrentModificationException and it may or may not show the effects of any modifications to
the set that occur while the iteration is in progress.
Null elements are not permitted. Attempts to insert a null element will
throw NullPointerException. Attempts to test for the presence of a
 null element or to remove one will, however, function properly.
Like most collection implementations, EnumSet is not synchronized.
If multiple threads access an enum set concurrently, and at least one of the threads modifies the set,
it should be synchronized externally.



 */
public class EnumSetExample {
/*
Let's take an example from Effective Java Book. In this example, we have used
 basic colors RED, GREEN, and BLUE to create a custom color by using EnumSet.
 As I said, EnumSet is very good for combining effects, whether it's text styles e.g.
 BOLD and UNDERLINE, as described in Effective Java, or combining basic colors to
  create custom color here. If you have MS paint, you can even test the combination of colors e.g.
you can combine RED and BLUE to create YELLOW, combine all three to create WHITE, or combining RED and BLUE to create PINK.


 */
    public void func1(){
       // Set<MyEnum> s = Collections.synchronizedSet(EnumSet.noneOf(MyEnum.class));
         EnumSet<Color> yellow = EnumSet.of(Color.RED, Color.GREEN);
       // drawLine(yellow);

        // RED + GREEN + BLUE = WHITE
         EnumSet<Color> white = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        //drawLine(white);

    }


    private enum Color {
        RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);
        private int r;
        private int g;
        private int b;

        private Color(final int r, final int g, final int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public int getR() {
            return r;
        }

        public int getG() {
            return g;
        }

        public int getB() {
            return b;
        }
    }

}

