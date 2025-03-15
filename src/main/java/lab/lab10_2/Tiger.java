package lab.lab10_2;

import java.security.SecureRandom;

public class Tiger extends Animal {

    private final int MAX_SPEED = 100;

    public Tiger(String name) {
        setName(name);
        setSpeed(speed());
    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(MAX_SPEED);
    }
}
