package JavaConcepts.Java8Concepts;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Examples {

    static <T,U> Comparator<T> comparing(
            Function<? super T,? extends U> keyExtractor,
            Comparator<? super U> keyComparator)
    {
        return null;
    }

    static <T,U> Comparator<T> comparing1(
            Function<T,U> keyExtractor,
            Comparator<U> keyComparator)
    {
        return null;
    }

    static List<User> users = Arrays.asList(
            new User("C", 30),
            new User("D", 40),
            new User("A", 10),
            new User("B", 20),
            new User("E", 50));

    public static void streamsExample(){
        List<String> lines = Arrays.asList("spring", "node", "harsh");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"harsh".equals(line))     // we dont like harsh
                .collect(Collectors.toList());              // collect the output and convert streams to a List


        result.forEach(System.out::println);
    }

    public static void main(String[] args){


        List<User> sortedList = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }

    static class User {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
