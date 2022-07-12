package JavaConcepts.JavaCollections.UtilsClassExample;


import java.util.Arrays;
import java.util.Comparator;

public class ArraysClassExample {

    public void func1(){
        Arrays.sort(new char[8]);
        Arrays.sort(new Integer[8], new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        Integer[]arr=new Integer[10];
        Arrays.sort(arr,1,2);
        Arrays.sort(arr, 1, 2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        Arrays.compare(arr,arr);
        Arrays.sort(arr, 1, 6, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        Arrays.binarySearch(arr,1);
        Arrays.copyOf(arr,10);
        Arrays.copyOfRange(arr,5,7);


    }
}
