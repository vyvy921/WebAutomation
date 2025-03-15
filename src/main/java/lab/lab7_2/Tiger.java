package lab.lab7_2;

import java.security.SecureRandom;

public class Tiger extends Animal {

    public Tiger(String name) {
        super.setName(name);
        super.setSpeed(new SecureRandom().nextInt(100));
    }
}
