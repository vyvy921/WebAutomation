package lab.lab12;

public class Animal {
    private String name;
    private int speed;
    private Ability ability;

    public Animal(String name, Ability ability) {
        this.name = name;
        this.speed = ability.act();
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "ability=" + ability +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
