package lab.lab10_2;

import java.security.SecureRandom;

public class Dog extends Animal {

    private final int MAX_SPEED = 60;

    public Dog(String name) {
        setName(name);
        setSpeed(speed());
    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(MAX_SPEED);
    }
}
