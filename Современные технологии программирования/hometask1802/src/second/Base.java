package second;

public abstract class Base {
    private int EmployeeID;
    private String EmployeeName;


    public Base(int EmployeeID, String EmployeeName) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;

    }

    /**
     *
     * @return имя работника
     */
    public String getEmployeeName() {
        return EmployeeName;
    }

    /**
     *
     * @return id работника
     */
    public int getEmployeeID(){
        return EmployeeID;
    }

    /**
     * Метод для расчета ЗП
     * Переопределен в {@link HourSalary} и {@link FixedSalary}
     *
     * @return ЗП сотрудников
     */
    public abstract double avarageSalary();
}
