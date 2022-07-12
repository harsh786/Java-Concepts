package JavaConcepts.JavaOtherConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person>
{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        int val=Integer.compare(this.age,o.getAge());
        if(val==0){
            val= this.name.compareToIgnoreCase(o.getName());
        }
        return val;

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


public class ComparableExample {
    public static void main(String[] args) {
        Person ob1=new Person(1,"harsh");
        Person ob2=new Person(1,"aharsh");
        Person ob3=new Person(2,"harsh2");
        Person ob4=new Person(3,"harsh1");

       List<Person> lsPerson=new ArrayList<Person>();
        lsPerson.add(ob1);
        lsPerson.add(ob2);
        lsPerson.add(ob3);
        lsPerson.add(ob4);

        Collections.sort(lsPerson);
        for(Person per: lsPerson) {System.out.print(" "+per);}

    }
}
