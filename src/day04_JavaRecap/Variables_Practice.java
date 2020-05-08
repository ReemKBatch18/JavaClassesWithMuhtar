package day04_JavaRecap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Variables_Practice {

    public static void main(String[] args) {
        /*
        when we create variable, we give dataType then we give variableName
        1.    Must be started with letters
2.    Must be Unique
3.    Cannot be Java Reserved Words
4.    Cannot contains special character other than these two: $ and _
         */
        byte num1 = 127; //can't be decimal, cant be more than 127
        short num2 = num1; // double>float>long>int>short>byte
        // byte num3 = num2; can't be done cause byte is smaller can't be assigned to short
        int num4 = num2; // this is ok
        long num5 = 9999999999L;
        float num6 = 100L;
        System.out.println(num6); //100.0
       // float num7 = 0.5; wrong.. considered double automatically
        float num8 =0.5f; // ok 0.5
        double num9 = 0.5f; // ok double larger than float
        double num10 = 9999999L;
        double num11= 100.5;
        System.out.println(num11);
        char ch1 = '$';//we use single quote
        System.out.println(ch1); // it will print the character $
        //every single character has a corresponding number
        char ch2 = 22000;
        System.out.println(ch2);
        int a1 = '8';
        System.out.println(a1); // it prints the corresponding number of the character 8 (not print the number 8)
        int a2= 'z'; //int only accept numbers
        System.out.println(a2);
        double d1= 'z' + '8'; // z8, 178, or 178.0?
        System.out.println(d1); // prints 178.0
        char ch3 = 178;
        System.out.println(ch3); // ²
        char ch4 = 'z' +'8';
        System.out.println(ch4); // same as above ²
        boolean bool1= true ;
        boolean bool2= false;
        System.out.println(9>10); //false
        System.out.println(9>=9);//true
        System.out.println(9!=10); //true
        System.out.println('a'=='b');//false
        System.out.println('a'=='b'-1); //true
                         // 97 == 98 - 1
                         // 97 == 97 true
        //System.out.println('a'=="a"); // ' ' does not match "  "
        System.out.println("Muhtar"== "Good Guy"); //false
        System.out.println("Muhtar" != "Good Guy");//true
        System.out.println("Muhtar" == "muhtar"); //false case sensitive
        boolean r1= !true; // =false
        System.out.println(r1); // it will print false
        System.out.println(!r1); // it will print true
        System.out.println(!true == false); // will print true
        System.out.println(!true != !false); // will print true














    }
}
