package day53_Iterator_Maps;


import java.util.*;

public class c04_Iteratin_Collections2 {
    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();
        // this set does NOT accept duplicates
        names.addAll(Arrays.asList("Mehemt", "Mohamad", "yucel","sha", "ozgur", "ahmet","osman",
                                    "ozgur","ozgur","ozgur","mohamad", "yucel","sha"));
        System.out.println(names);  //  [Mehemt, Mohamad, yucel, sha, ozgur, ahmet, osman, mohamad]
        // prints all names without duplicates


        // we need to remove all names that contains m or M
        // we need to iterate it .--> we call the iterator method -->
        // --> will return me iterator --> assign to iterator (preferred name it)
        Iterator<String > it = names.iterator();
        // I will apply the while loop or for loop
        // what boolean can I pass in this while loop? the hasNext() method
        while(it.hasNext()) {
            // this boolean will only become false if there are no more elements to iterate
        String s = it.next(); // next() will return me a String ==> I can assign it to a string variable
           if(s.toLowerCase().contains("m")){
               // or
               // if(s.contains("m") || s.contains("M")){
               it.remove();
           }
        }
        System.out.println(names);  //  [yucel, sha, ozgur]

        System.out.println("************************************************************");

        // can I use the for loop ? yes I can :
        // it's mandatory in for loop to give the initialization inside the loop
        // to initialize the iterator it2 which will iterate the LinkedHashSet names2
        // what can I give for the condition that returns me boolean? I can use hasNext() method
        // do I have to give increment or decrement? NO --> it will become false when there are no elements to be retrieved.
        LinkedHashSet<String> names2 = new LinkedHashSet<>();
        // this LinkedHashSet does NOT accept duplicates
        names2.addAll(Arrays.asList("Mehemt", "Mohamad", "yucel","sha", "ozgur", "ahmet","osman",
                "ozgur","ozgur","ozgur","mohamad", "yucel","sha"));

        for ( Iterator<String > it2= names2.iterator(); it2.hasNext() ; ){
            // we can either initialize String s = I.next() to return us each element
            // or do the following:
            if(it2.next().toLowerCase().contains("m")){
                it2.remove();
            }
        }
        System.out.println(names2); //  [yucel, sha, ozgur]

        System.out.println("************************************");
        // now we will apply the lambda
        // lambda can be used in java8 or higher
        //
        //
        LinkedHashSet<String> names3 = new LinkedHashSet<>();
        // this LinkedHashSet does NOT accept duplicates
        names3.addAll(Arrays.asList("Mehemt", "Mohamad", "yucel","sha", "ozgur", "ahmet","osman",
                "ozgur","ozgur","ozgur","mohamad", "yucel","sha"));
        names3.removeIf( p -> p.toLowerCase().contains("m"));

        System.out.println(names3);

        System.out.println("**********************************");

        LinkedHashSet<String> names4 = new LinkedHashSet<>();
        // this LinkedHashSet does NOT accept duplicates
        names4.addAll(Arrays.asList("Mehmet", "Mohamad", "yucel","sha", "ozgur", "ahmet","osman",
                "ozgur","ozgur","ozgur","Mohamad", "yucel","sha"));

        // we need to remove all names that has Mehmet, Mohamad, or ozgur ==> I can use removeAll()

        names4.removeAll(Arrays.asList("Mehmet","ozgur","Mohamad"));
        System.out.println(names4);     //  [yucel, sha, ahmet, osman]

        System.out.println("***********************************");
        LinkedHashSet<String> names5 = new LinkedHashSet<>();
        // this LinkedHashSet does NOT accept duplicates
        names5.addAll(Arrays.asList("Mehmet", "Mohamad", "yucel","sha", "ozgur", "ahmet","osman",
                "ozgur","ozgur","ozgur","Mohamad", "yucel","sha"));

        // Now I want to keep only the names Mehmet, Mohamad, and ozgur ==> I can use retainAll()
        names5.retainAll(Arrays.asList("Mehmet","ozgur","Mohamad"));

        System.out.println(names5);     //  [Mehmet, Mohamad, ozgur]

        System.out.println("***********************************");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

        // verify that 5,6,9,8 are contained in the list
        // if you dont' use bulk operation how many times you need to apply the contains() method? 4 times
        // but with bulk operations==> call containAll() method
        // return type of this method containAll() is boolean
        // we can assign it to boolean
        boolean result = list.containsAll(Arrays.asList(5,6,9,8));
        // this method internally uses the iterator --> no need to use if or loop

        System.out.println(list.containsAll(Arrays.asList(5,6,9,8))  ); // true
        System.out.println(list.containsAll(Arrays.asList(5,6,9,8,11))); // false because there is no 11



        }
    }

