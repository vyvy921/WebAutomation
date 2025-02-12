package lab.lab7_2;

import java.security.SecureRandom;

public class Dog extends Animal{

    public Dog(String name) {
        super.name = name;
        super.speed = new SecureRandom().nextInt(60);
    }
}
