package JavaConcepts.JavaCollections.MapExample;

import java.util.*;

/*
Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface,
 with predictable iteration order. It inherits HashMap class and implements the Map interface.

 Java LinkedHashMap contains values based on the key.
Java LinkedHashMap contains unique elements.
Java LinkedHashMap may have one null key and multiple null values.
Java LinkedHashMap is non synchronized.
Java LinkedHashMap maintains insertion order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>

K: It is the type of keys maintained by this map.
V: It is the type of mapped values.


LinkedHashMap----->HashMap------>AbstractMap-------->Map

 */
public class LinkedHashMapExample {

    public void func1(){
        LinkedHashMap<Integer,Integer> mp=new LinkedHashMap<>();
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
