package second;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Base> employees = new ArrayList<>(){{
            add(new HourSalary(1, "Artem", 100));
            add(new HourSalary(2, "Max", 10.99));
            add(new FixedSalary(3,"Alex", 15000));
            add(new FixedSalary(4, "Nick", 2500));
            add(new FixedSalary(5, "Farhod", 500));
        }};
        employees.sort((o1, o2) -> {
            if (o1.avarageSalary() == o2.avarageSalary())
                return o1.getEmployeeName().compareTo(o2.getEmployeeName());
            return (int) (o2.avarageSalary() - o1.avarageSalary());
        });
        System.out.println("------ ID + NAME + SALARY ------");
        for (Base employee : employees) {
            System.out.println("[" + employee.getEmployeeID() + "]: " + employee.getEmployeeName() + " - " + String.format("%.2f", employee.avarageSalary()) + "$");
        }
        System.out.println();

        System.out.println("------ TOP 5 EMPLOYYES ------");
        for (int index = 0; index < 5; index++) {
            Base employee = employees.get(index);
            System.out.println(employee.getEmployeeName());
        }
        System.out.println();

        System.out.println("------ Last 3 ID ------");
        for (int index = employees.size() - 3; index < employees.size(); index++) {
            Base employee = employees.get(index);
            System.out.println(employee.getEmployeeID());
        }
    }

}
