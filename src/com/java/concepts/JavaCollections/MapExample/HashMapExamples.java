package com.java.concepts.JavaCollections.MapExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
A map contains values on the basis of key, i.e. key and value pair.
 Each key and value pair is known as an entry. A Map contains unique keys.

A Map is useful if you have to search, update or delete elements on the basis of a key.

There are two interfaces for implementing Map in java: Map and SortedMap,
and three classes: HashMap, LinkedHashMap, and TreeMap. The hierarchy of Java Map is given below:

A Map doesn't allow duplicate keys, but you can have duplicate values.
HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.

A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.

Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique.
If you try to insert the duplicate key, it will replace the element of the corresponding key.
 It is easy to perform operations using the key index like updation, deletion, etc.
 HashMap class is found in the java.util package.

HashMap in Java is like the legacy Hashtable class, but it is not synchronized.
 It allows us to store the null elements as well, but there should be only one null key.
 Since Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value. It inherits the AbstractMap class
  and implements the Map interface.

public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable

https://www.javatpoint.com/working-of-hashmap-in-java

 */
public class HashMapExamples {

    public void func1(){
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.size();
        mp.clear();
        mp.clone();
        mp.get(2); //return null;
        mp.size();
        mp.isEmpty();
        mp.containsKey(2);//boolean
        mp.containsValue(3);//boolean
        mp.getOrDefault(2,0);//default val if key not present
        mp.put(3,10);
        mp.putAll(new HashMap<Integer,Integer>());
        mp.putIfAbsent(2,3);//return null not present
        mp.remove(Integer.valueOf(2));
        mp.remove(2,3);
       Set keySet= mp.keySet();
        List<Integer> ls= (List<Integer>) mp.values();
        mp.replace(2,3);
        mp.equals(new HashMap<Integer,Integer>());

        mp.equals(null);
        mp.hashCode();

/*
Map.entry is interface

 */

        for(Map.Entry<Integer,Integer> m:mp.entrySet()){
                m.getKey();
                m.getValue();
                m.setValue(33);
                m.equals(m);
        }
    }
}
