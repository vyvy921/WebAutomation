package lab.lab_9;

import java.security.SecureRandom;

public class Animal {

    private String name;
    private boolean isFlyable;
    private int speed;

    //Contructor
    protected Animal(Builder builder) {
        this.name = builder.name;
        this.isFlyable = builder.isFlyable;
        this.speed = new SecureRandom().nextInt(100);
    }

    //Read-only

    public boolean isFlyable() {
        return isFlyable;
    }


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "isFlyable=" + isFlyable +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    //Customer - Inner class
    public static class Builder {

        private String name = "Anonymous";
        private boolean isFlyable = false;

        //write-only
        public Builder setFlyable(boolean flyable) {
            this.isFlyable = flyable;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }


}
