package lab.lab7_1;

public class Employee {

    protected double salary;
    protected String name;
    protected static int count = 0;


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
