package day40_Encapsulation;

public class c10_BankOfAmerica {

    public static void main(String[] args) {

        // we will create objects for our c09_EmployeeInfo class
        c09_EmployeeInfo Abdul = new c09_EmployeeInfo();

        // how can I read the address of Abdul in this class?
        // I can call getter method to get address through the object Abdul
        System.out.println(Abdul.getAddress()); // null now because first we need to set it calling setter method

        Abdul.setAddress("Virginia");
        System.out.println(Abdul.getAddress()); // Virginia

        // to get the company name:
        System.out.println(Abdul.companyName);

        // to get the salary:
        System.out.println(Abdul.getSalary()); // 0.0 first we need to set it

        Abdul.setSalary(120000.0);
        System.out.println(Abdul.getSalary()); // 120000.0







    }
}
