package lab.lab7_2;

import java.security.SecureRandom;

public class Horse extends Animal {

    public Horse(String name) {
        super.setName(name);
        super.setSpeed(new SecureRandom().nextInt(75));
    }
}
