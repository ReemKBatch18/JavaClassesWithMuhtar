package day54_Maps;
/*
JVM runs a process called garbage collector that deletes any unreferenced object
2 ways:
    - by nulling the object
    - by reassigning
If an object was referenced by a variable and later was re-assigned ==> garbage collector will collect it

Compiler calls .finalize() method internally .
finalize() method: does the role of cleaning up unreferenced object
 */
public class c05_GarbageCollector {
    public static void main(String[] args) {
        // an object created without reference ==> will be collected by garbage collector ==> will not be used again
        // an object created with a reference ==> will not be collected by garbage collector

        // unreferenced object:
        String str = new String ("school");
        // now one object is created in heap memory
        // what happens if I re-assign something else
        str = new String ("school2");
        // now another object is created in heap memory
        // and one object the first one is eligible to be collected by garbage collector : school is unreferenced

        Integer num = new Integer(123);
                num = new Integer(124);
                // now 123 is unreferenced and will be collected by garbage collector
        Double n = new Double(0.5);
               n = null;
               // after line 23, this object 0.5 is no longer referenced by n ==> 0.5 is eligible to garbage collector





    }

}
