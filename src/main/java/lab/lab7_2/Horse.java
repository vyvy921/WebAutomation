package lab.lab7_2;

import java.security.SecureRandom;

public class Horse extends Animal{

    public Horse(String name) {
        super.name = name;
        super.speed = new SecureRandom().nextInt(75);
    }
}
