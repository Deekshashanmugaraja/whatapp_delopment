/*
* A map contains values on the basis of key, i.e. key and value pair.
* Each key and value pair is known as an entry. A Map contains unique keys.
* A Map is useful if you have to search, update or delete elements on the basis of a key.

* There are two interfaces for implementing Map in java -> Map and SortedMap
* Three classes ->  HashMap, LinkedHashMap, and TreeMap.

* A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.

* A Map doesn't allow duplicate keys, but you can have duplicate values.
* HashMap and LinkedHashMap allow null keys and values
*
 * TreeMap
   TreeMap is the implementation of Map and SortedMap.
   It maintains ascending order
*/


package Day_5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Interface {
    public static void main(String[] args) {
        Map<String, Integer> TelephoneDirectory = new TreeMap<String, Integer>();

        TelephoneDirectory.put("Harris", 984561555);
        TelephoneDirectory.put("Michael", 986523166);
        TelephoneDirectory.put("Mike", 987456133);
        TelephoneDirectory.put("Sharma", 984561555);  //duplicate
        TelephoneDirectory.put("AgentUnknown", null);
        TelephoneDirectory.put("AgentUnknown1", null);


        // To convert it into Set
        // employeeDetails.entrySet();

        //Converting to Map.Entry so that we can get key and value separately
        for (Map.Entry m : TelephoneDirectory.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        TelephoneDirectory.remove("Sharma");
        System.out.println(TelephoneDirectory.containsKey("Vijay"));
        System.out.println(TelephoneDirectory);
        System.out.println("Hash Code value for Map: "+TelephoneDirectory.hashCode());

        System.out.println(TelephoneDirectory.keySet());

    }
}






/*


 * HashMap
    It has pair values(keys,values)
    NO duplication key values
    Doesn't maintain any order.
    Allows null key value


* HashTable
   same as hash map
   It does not allows null keys and null values

* LinkedHashMap
   It maintains insertion order.
   Based on linked list and hashing data structures
hiding last seen
adding video
adding audio
.
 */
