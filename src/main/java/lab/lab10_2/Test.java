package lab.lab10_2;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Animal horse1 = new Horse("Horse 1");
        Animal horse2 = new Horse("Horse 2");
        Animal tiger1 = new Tiger("Tiger 1");
        Animal tiger2 = new Tiger("Tiger 2");
        Animal dog1 = new Dog("Dog 1");
        Animal dog2 = new Dog("ADog 2");
        Animal dog3 = new Dog("Dog 3");

        dog1.setSpeed(70);
        dog2.setSpeed(70);
        dog3.setSpeed(70);

        List<Animal> animalList = Arrays.asList(horse1, horse2, tiger1, tiger2, dog2, dog1, dog3);

        ControllerAnimal.race(animalList);

    }
}
