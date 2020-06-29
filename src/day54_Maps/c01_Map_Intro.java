package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Array       fixed size
            primitives and objects

Collection  dynamic size
            objects only
            Set class does Not accept duplicates

Map        dynamic size
           objects only
           Key can NOT be DUPLICATED
           Value can be duplicated


Map       is an Interface
          accepts key and value: Map<Key, Value>
          Key MUST BE UNIQUE
          Value can be duplicate
          must be Objects (not primitive)
          No index number (can't retrieve using index number with get()method)
          implemented by HashTable class
          implemented by LinkedHashMap class
          implemented by HashMap class

Map Methods:
        put(key,value)  : inserts key and value
        get(key)        : returns the value of the given key
        remove(key)     : removes the value of the given key
        size()          : returns size of Map
        containsKey(key): checks if key is in the map ==> returns boolean
        containsValue(value): checks if value is in the map ==> returns boolean
        clear()         : clears everything
        isEmpty()       : checks if the list is empty or not ==> returns boolean
Special Methods of Map:
        keySet()        : returns all the keys from the map as a Set
        Values()        : returns all the values from the map as a collection
        entrySet()      :


Entry interface:
    Entry<Key,Value>
    getKey()            : returns the Key of the Entry
    getValue()          : returns the value of the Entry

CLASSES THAT EXTEND MAP:

HashMap:            does not keep the insertion order
                    accepts null

HashTable:          is synchronized (methods contain synchronized keyword)
                    ==> thread safe: one thread at a time
                    ==> slower
                    does not accept null

LinkedHashMap:      keeps insertion order as it is
                    put() and remove() are faster
                    accepts null

TreeMap:            sorts the keys in ascending order
                    does not accept null





String[] name ={}
Double[] salary={}

List<String> name = new ArrayList<>();
List<Double> salary = new ArrayList<>();

Map can accept two data types: Map<String, Double>






 */
public class c01_Map_Intro {

    public static void main(String[] args) {

        // this is how we declare the maps
        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        // we can't create object from Map because it is an interface

        // How did we add data to collection? using the add() method
        // but here we can not use the add() method
        // we can use the put(key,value) method
       //this method put() doesn't do autoboxing to change a value to double.
        // value must be entered in double format
        employeeInfo.put("zarina", 120000.0);
        System.out.println(employeeInfo);       //  {zarina=120000.0}
        System.out.println(employeeInfo.size()); // 1 because we have 1 pair of data

        employeeInfo.put("bakhodir", 110000.0);
        System.out.println(employeeInfo);          //  {zarina=120000.0, bakhodir=110000.0}
        System.out.println(employeeInfo.size());    // 2

        // to retrieve data, we can not use index number because Map doesn't have index number
        // we use get() method and provide the key object
        System.out.println(employeeInfo.get("zarina"));    // 120000.0
        System.out.println(employeeInfo.get("bakhodir"));  // 110000.0

        // in collection we use remove method to remove values
        // in Map, we don't have index
        // ==> to remove any value in the map we remove it by the key using the remove() method

        employeeInfo.remove("bakhodir");
        // after we removed 1 pair from the Map ==> size is back to 1
        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size()); // 1

        // to create a data structure that has the name and ID of employee==> we use map
        // Map doesn't accept duplicate Key. Key MUST be unique
        // if we add key with same value that we have but different value it will accept the latter one
        employeeInfo.put("zarina", 130000.0);
        // Now the list will have the new value with the same key
        System.out.println(employeeInfo);       // {zarina=130000.0}

        employeeInfo.clear();       // clears everything
        System.out.println(employeeInfo); //{}





    }
}
