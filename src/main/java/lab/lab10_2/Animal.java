package lab.lab10_2;

public abstract class Animal implements Comparable<Animal> {
    protected String name;
    protected int speed;


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Create abstract method speed() return random speeds
    public abstract int speed();

    @Override
    public int compareTo(Animal animal) {
        return animal.getSpeed() - this.getSpeed();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
