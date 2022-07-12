package JavaConcepts.JavaOtherConcepts;

import java.util.*;

class Person1
{
    int age;
    String name;

    public Person1(int age, String name) {
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
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class PersonAgeComparator implements Comparator<Person1> {

    @Override
    public int compare(Person1 o1, Person1 o2) {
        int val=Integer.compare(o1.age,o2.getAge());
        if(val==0){
            val= o1.getName().compareToIgnoreCase(o2.getName());
        }
        return val;
    }
}
public class ComparatorExample {


    public static void main(String[] args) {
        Person1 ob1 = new Person1(1, "harsh");
        Person1 ob2 = new Person1(1, "aharsh");
        Person1 ob3 = new Person1(2, "harsh2");
        Person1 ob4 = new Person1(3, "harsh1");
        Comparator<Person1> ageComparator=new PersonAgeComparator();
       List<Person1> lsPerson=new ArrayList<>();
        lsPerson.add(ob1);
        lsPerson.add(ob2);
        lsPerson.add(ob3);
        lsPerson.add(ob4);

        Collections.sort(lsPerson, ageComparator);
        for(Person1 per: lsPerson) {System.out.print(" "+per);}


    }
}
