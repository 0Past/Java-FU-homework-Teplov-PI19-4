package second;

public class FixedSalary extends Base {
    private double fixedSalary;
    public FixedSalary(int EmployeeID, String EmployeeName, double fixedSalary){
        super(EmployeeID, EmployeeName);
        this.fixedSalary = fixedSalary;
    }
    public double getFixedSalary(){
        return fixedSalary;
    }
    public void setFixedSalary(double fixedSalary){
        this.fixedSalary = fixedSalary;
    }
    public double averageSalary(){
        return fixedSalary;
    }

    @Override
    public double avarageSalary() {
        return fixedSalary;
    }
}
