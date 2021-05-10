package com.java.concepts.JavaCollections.UtilsClassExample;


import java.util.*;

public class CollectionsClassExample {

    public void func1(){
       List<Integer> ls= Collections.EMPTY_LIST;
        Set<Integer>st=Collections.EMPTY_SET;
        Map<Integer,Integer>mp=Collections.EMPTY_MAP;
       List<Integer>l= Arrays.asList(1,2,3);
        Collections.sort(l);
        Collections.sort(l, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        Collections.max(l);
        Collections.min(l);
       int count= Collections.frequency(l,1);
       Collections.min(l, new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return 0;
           }
       });

        Collections.reverse(l);
        Collections.swap(l,1,2);
        Collections.unmodifiableList(l);
        Collections.synchronizedList(l);
        Collections.binarySearch(l, 1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });




    }
}
