package day50_Polymorphism.Task2_ScrumTeam;
/*
 1. create an abstract class named Employees
            private variables: employeeName, employeeId, salary, ssn, JobtiTle, isFullTime, hasPTO
            encapsulate all private variables
            abstract methods: work(), meeting()
            instance Methods: toString()

 */
public abstract class Employee {
    // private variables
    private String employeeName;
    private long employeeId;
    private double salary;
    private int ssn;
    private String jobTitle;
    private boolean isFullTime;
    private boolean hasPTO;

   // getters and setters for all variables
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public boolean isHasPTO() {
        return hasPTO;
    }

    public void setHasPTO(boolean hasPTO) {
        this.hasPTO = hasPTO;
    }

    public abstract void work();
    public abstract void meeting();
   // toString method
    public String toString(){
        return "Employee Name: "+employeeName+"\nEmployee ID: "+employeeId+"\nJob Title: "+jobTitle+
                "\nFull Time: "+isFullTime+"\nSalary: $"+salary+"\nPTO available: " +hasPTO;
    }

}
