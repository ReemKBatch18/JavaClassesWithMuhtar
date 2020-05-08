package day05_Unary_ShorthandOperators;

public class Divisibility {

    public static void main(String[] args) {
        //Datatype VariableName = Data;

        int number = 65;

        boolean divisibleBy2 = number % 2 ==0;
                // if the number can be divided by 2 w/out remainder./
        boolean divisibleBy3 = number % 3 == 0;
        // if the number can be divided by 3 w/out remainder.
        boolean divisibleBy5 = number % 5 == 0;
        // if the number can be divided by 5 w/out remainder.

        String result1 =  number + " is divisible by 2: " + divisibleBy2;
        String result2 =  number + " is divisible by 3: " + divisibleBy3;
        String result3 =  number + " is divisible by 5: " + divisibleBy5;

      /*  System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
*/
  //      System.out.println( result1 + "\n" + result2 +"\n" + result3);
        String finalResult = result1 + "\n" + result2 +"\n" + result3;
        System.out.println(finalResult);

    }


}

/*
2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
			Ex:
				number = 65;  ==> int
				divisibleBy2 ==> true/false
				divisibleBy3 ==> true/false
				divisbileBy5 ==> true/false
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
				number = 80;
			output:
				80 is divisible by 2: true
				80 is divisible by 3: false
				80 is divisible by 5: true
 */