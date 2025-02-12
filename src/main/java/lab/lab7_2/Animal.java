package lab.lab7_2;

public class Animal {
protected String name;
protected int speed;


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
