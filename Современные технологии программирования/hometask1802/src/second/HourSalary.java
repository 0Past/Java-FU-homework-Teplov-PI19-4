package second;

public class HourSalary extends Base {
    private double hourSalary;
    public HourSalary(int EmployeeID, String EmployeeName, double hourSalary){
        super(EmployeeID, EmployeeName);
        this.hourSalary = hourSalary;
    }
    public double getHourlyRate() {
        return hourSalary;
    }
    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;

    }
    @Override
    public double avarageSalary() {
        return 20*8*8*hourSalary;
    }
}
