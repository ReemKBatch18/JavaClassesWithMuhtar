package Tasks.Replits;
import java.util.*;
public class quizquestion040 {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("what is the farthest planet in the solar system:" );
            System.out.println("a)venus" );
            System.out.println("b)pluto" );
            System.out.println("c)neptune" );

            String answer = s.nextLine();

            //your code here
            if(answer == "b"){
                System.out.println("b is correct");
            }else if(answer=="a"){
                System.out.println("a is wrong");
            }else if (answer =="c" ){

                System.out.println("c is wrong");
            }else {
                System.out.println(answer+ " is not a valid answer");
            }





        }
    }

