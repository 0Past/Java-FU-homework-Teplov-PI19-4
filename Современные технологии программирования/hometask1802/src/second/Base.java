package second;

public abstract class Base {
    private int EmployeeID;
    private String EmployeeName;


    public Base(int EmployeeID, String EmployeeName) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;

    }
    public String getEmployeeName() {
        return EmployeeName;
    }

    public int getEmployeeID(){
        return EmployeeID;
    }

    public abstract double avarageSalary();
}
