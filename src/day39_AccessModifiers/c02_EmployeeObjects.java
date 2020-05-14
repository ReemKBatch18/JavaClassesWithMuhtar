package day39_AccessModifiers;

public class c02_EmployeeObjects {

    public static void main(String[] args) {

        // 1st object: emp1:
        // we will use 1st constructor: passing 1 argument
        Employee emp1 = new Employee("Rustem");
        System.out.println(emp1);
        //Name: Rustem, ID: 0, Job Title: null, Company Name: Bank of America, Salary: $0.0, Gender:


        // 2nd object: emp2:
        // we will use 2nd constructor: passing 2 argument
        Employee emp2 = new Employee("John", "Mechanic");
        System.out.println(emp2);
        //Name: John, ID: 0, Job Title: Mechanic, Company Name: Bank of America, Salary: $0.0, Gender:

        // 3rd object: emp3:
        // we will use 3rd constructor: passing 3 argument
        Employee emp3 = new Employee("Saban", "SDET", 123);
        System.out.println(emp3);
        //Name: Saban, ID: 123, Job Title: SDET, Company Name: Bank of America, Salary: $0.0, Gender:


        // 4th object: emp4:
        // we will use 4th constructor: passing 4 arguments:
        Employee emp4 = new Employee("Ozgur", "SDET", 456, 120000);
        System.out.println(emp4);
        //Name: Ozgur, ID: 456, Job Title: SDET, Company Name: Bank of America, Salary: $120000.0, Gender:

        // 5th object: emp5:
        // we will use 5th constructor: passing 5 arguments:
        Employee emp5 = new Employee("Osman", "SDET", 789, 120500, 'M');
        System.out.println(emp5);
        // Name: Osman, ID: 789, Job Title: SDET, Company Name: Bank of America, Salary: $120500.0, Gender: M


    }


}
