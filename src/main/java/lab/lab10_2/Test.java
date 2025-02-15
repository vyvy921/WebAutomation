package lab.lab10_2;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Animal horse1 = new Horse("Horse 1");
        Animal horse2 = new Horse("Horse 2");
        Animal tigher1 = new Tiger("Tiger 1");
        Animal tigher2 = new Tiger("Tiger 2");
        Animal dog1 = new Dog("Dog 1");
        Animal dog2 = new Dog("Dog 2");

        List<Animal> animalList = Arrays.asList(horse1, horse2, tigher1, tigher2, dog1, dog2);

        ControllerAnimal.race(animalList);

    }
}
