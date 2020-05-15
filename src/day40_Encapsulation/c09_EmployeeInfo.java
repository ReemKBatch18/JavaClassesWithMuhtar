package day40_Encapsulation;
/*
                        GENERATE : SHORT CUT for :
                                    Constructor
                                    getter
                                    setter
                                    getter and setter
                                    toString()
                                    etc
                       Right click and select Generate and choose what you want :)
 */
public class c09_EmployeeInfo {

    private double salary;
    private long SSN;
    private int ID;
    private String Address;

    public static String companyName = "Bank of America"; // ONCE COPY for all objects

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
}
