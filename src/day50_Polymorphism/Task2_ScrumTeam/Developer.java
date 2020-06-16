package day50_Polymorphism.Task2_ScrumTeam;
/*
 5. create a final class named Developer that can inherit Employees, ScrumTeam, and WorkRemotely
  set a constructor that can initialize fields (instance variables)
 */
public final class Developer extends Employee implements ScrumTeam, WorkRemotely {

    @Override
    public void work() {
        System.out.println(getEmployeeName()+" is working");

    }

    @Override
    public void meeting() {
        System.out.println(getEmployeeName()+ " is in a meeting");

    }

    @Override
    public void dailyStandUp() {
        System.out.println(getEmployeeName()+ " is attending standUp meeting");

    }

    @Override
    public void workFromHome() {
        System.out.println(getEmployeeName()+" is working from home");
    }

    public Developer(String employeeName, long employeeId, double salary, int ssn,
                     String jobTitle, boolean isFullTime, boolean hasPTO){
        setEmployeeName(employeeName);
        setEmployeeId(employeeId);
        setSalary(salary);
        setSsn(ssn);
        setJobTitle(jobTitle);
        setFullTime(isFullTime );
        setHasPTO(hasPTO);



    }
}
