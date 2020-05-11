package Tasks.WarmUpPractices;
/*
2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
 */
public class CC_HumanResources {
    static CC_Employee employee1 = new CC_Employee();
    static CC_Employee employee2 = new CC_Employee();
    static CC_Employee employee3 = new CC_Employee();
    static CC_Employee employee4 = new CC_Employee();
    static CC_Employee employee5 = new CC_Employee();

    static {
        employee1.setEmployeeInfo("Jack",123,111223333, "Tester",100000,'M');
    //    employee2.setEmployeeInfo();
    }
}
