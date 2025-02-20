package lab.lab12;

import java.security.SecureRandom;
import java.util.Random;

public class RunAble implements Ability{
    @Override
    public int act() {
        return new SecureRandom().nextInt(100);
    }
}
