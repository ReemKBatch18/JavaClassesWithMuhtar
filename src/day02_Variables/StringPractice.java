package day02_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringPractice {
    public static void main(String[] args) {


        String ssn = "123456"; //text, not a number
        String employeeName = "Sha Rejepov"; //Sha Rejepov
        String companyName = "Bank of America";


        System.out.println(employeeName);
        System.out.println(companyName);
        System.out.println(employeeName + " works at " + companyName);
        // + adds words to a sentence
    }
}