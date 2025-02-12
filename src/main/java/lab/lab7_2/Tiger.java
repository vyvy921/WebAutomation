package lab.lab7_2;

import java.security.SecureRandom;

public class Tiger extends Animal{

    public Tiger(String name) {
        super.name = name;
        super.speed = new SecureRandom().nextInt(100);
    }
}
