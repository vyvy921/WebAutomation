package lab.lab7_1;

import java.util.List;

public class ControllerEmpl {

    public static double calculateSalary(List<Employee> employeesList) {
        double sumSalary = 0;
        for (Employee employee : employeesList)
            sumSalary += employee.getSalary();

        return sumSalary;
    }
}
