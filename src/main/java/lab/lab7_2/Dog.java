package lab.lab7_2;

import java.security.SecureRandom;

public class Dog extends Animal {


    public Dog(String name) {
        super.setName(name);
        super.setSpeed(new SecureRandom().nextInt(60));
    }
}
