package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;
/*
entrySet()      :

Entry interface:
    Entry<Key,Value>
    getKey()    : returns the Key of the Entry
    getValue()  : returns the value of the Entry

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

 */
public class c04_Map_setEntry {
    public static void main(String[] args) {

        LinkedHashMap <String, String> countries = new LinkedHashMap<>();
        countries.put("Syria", "Damascus");
        countries.put("Lebanon", "Beirut");
        countries.put("Palastine", "AlQuds");
        countries.put("Iraq", "Baghdad");
        countries.put("Jordan", "Amman");

        // to create an Entry, an interface, we can use the entrySet() method
        // it will create a collection of entry
        // each (key, value) set is an entry
        // to iterate through each entry, we can use the for each loop
        // for variable name in loop we need to use Entry as the data type of the variable
        // then specify data type of key and value

        countries.entrySet(); // returns us an entry variable of the Entry data type
        // each in this loop represents (key, value)

        for (Map.Entry<String,String>  eachEntry : countries.entrySet()){
            System.out.println("Country: "+eachEntry.getKey()+ " - Capital is: " + eachEntry.getValue());
        }
                                        /*
                         Country: Syria - Capital is: Damascus
                         Country: Lebanon - Capital is: Beirut
                         Country: Palastine - Capital is: AlQuds
                         Country: Iraq - Capital is: Baghdad
                         Country: Jordan - Capital is: Amman

                                         */
         // let's say we use input with scanner
            String input = "Syria";
         for (Map.Entry<String, String> each: countries.entrySet()){
             String countryName = each.getKey();
             String cityName = each.getValue();
             if(countryName.equalsIgnoreCase(input)){
                 System.out.println(each.getValue());
             }
         }










    }
}
