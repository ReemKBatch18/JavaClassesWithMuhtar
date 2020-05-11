package day37_Constructors;

public class c06_StaticsReview_3 { // question 8
}

   // when I create instance variables in this class:==> I have to create dog objects to call these instance variables
    class dog{
        String name; // ins var : only belongs to dog class and dog objects
        int age;// ins var : only belongs to dog class and dog objects

       public void setInfo(String name, int age){   //question 9
// we need to put this. with the variable:
          name = name; // ==> this mean instance variable name was not assigned here becuase we did NOT use this.name = name
          age = age;// ==> this mean instance variable age was not assigned here becuase we did NOT use this.age = age

     // so if we create dog objects and call this setInfo() method and print in main method ==> null, 0 because they are not initialized
       }
    }



    class Test{
        public static void main(String[] args) {
            // here in order to be able to use the instance variables from dog class ==> I have to create dog objects
            // I can NOT create Test object and call instance variables name, age from dog's class into Test objects

        }
    }

