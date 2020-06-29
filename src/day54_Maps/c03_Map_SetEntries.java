package day54_Maps;

import jdk.nashorn.internal.runtime.UnwarrantedOptimismException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.jar.JarOutputStream;

public class c03_Map_SetEntries {
    public static void main(String[] args) {

        // user name must be unique, password can be duplicated
        // user name must be key, password can be value
        LinkedHashMap<String, String> fb = new LinkedHashMap<>();
        fb.put("tester1", "password1");
        fb.put("tester2","password1");
        fb.put("tester2","password2");
        // even thought I used put() method 3 times but size of Map is 2
        // because I used duplicated Keys ==> map will keep the last one added
        fb.put("tester3", "password3");
        fb.put("tester4", "password4");
        fb.put("tester5", "password5");
        System.out.println(fb);
        //{tester01=password1, tester02=password2, tester03=password3, tester04=password4, tester05=password5}
        System.out.println("****************************************");
   // KEYSET() METHOD: RETURNS ALL THE KEYS FROM THE MAP AS A SET
        // I will call keySet() that will return me a Set = a collection of the keys
        // why it returns them as a set ==> because set doesnt' accept duplicate keys
        // for each loop can iterate any data structure
        // it will iterate depending on the size of the map
        // if I iterate this collection of data (of keys) the for each loop will iterate 5 times
        fb.keySet();
        // since this method will return me a collection of data, I can use it in my for each loop
        // this collection of data contains all my keys
        // what's data type of my keys? it is String ==> I can use String data type for the variable in my loop
        for (String eachKey : fb.keySet() ){
            System.out.println(eachKey);
        }
        List<String > usernames = new ArrayList<>(fb.keySet());

        System.out.println("*****************************************");

        // if we can iterate the keys, can we also iterate the values from the map as collection? yes we can
        // to get all values from the map we can call the Values() method
        // if this method returns me a collection of values can I iterate it using the for each loop? yes I can
        // each element in this collection is String ==> so I can give the String as value of my variable in loop
        // this variable represents each value in the map
        for (String eachValue: fb.values()){
            System.out.println(eachValue);
        }
        // I can put all those values into a list
        // every single class that has an IS A relationship with

        List<String >  passwords = new ArrayList<>(fb.values());
        System.out.println(passwords);


        System.out.println("*********************************************");

        // now we will go to an advanced level of iteration
        // create a map that contains student names and student score: String and Integer
        // put 5 students names and their scores
        // write a program to print student names that scored less than 90
        // if score is less than 90 put in a list

        LinkedHashMap <String, Integer> students = new LinkedHashMap<>();
        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer> below90students = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> above90students = new LinkedHashMap<>();

        for( String eachKey : students.keySet()){
            // I can call get method from the map to get values of keys
            // then print only scores less than 90
            int eachValue = students.get(eachKey);
            if (eachValue < 90){
                below90students.put(eachKey, eachValue);

            }else {
                above90students.put(eachKey,eachValue);
            }

        }
        System.out.println(below90students); //{Hunar=89, Barzy=75, Hardi=80}

        System.out.println(above90students); //  {Adil=92, Rahman=93}




    }
}
