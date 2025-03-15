package lab.lab7_1;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Employee fte1 = new FullTimeEmpl("FTE1");
        Employee fte2 = new FullTimeEmpl("FTE2");
        Employee fte3 = new FullTimeEmpl("FTE3");

        Employee con1 = new ContractEmpl("CON1");
        Employee con2 = new ContractEmpl("CON2");

        List<Employee> employeeList = Arrays.asList(fte1, fte2, fte3, con1, con2);

        System.out.println(ControllerEmpl.calculateSalary(employeeList));

    }
}
