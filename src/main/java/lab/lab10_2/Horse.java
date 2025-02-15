package lab.lab10_2;

import java.security.SecureRandom;

public class Horse extends Animal {

    private final int MAX_SPEED = 75;

    public Horse(String name) {
        setName(name);
        setSpeed(speed());
    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(MAX_SPEED);
    }
}
