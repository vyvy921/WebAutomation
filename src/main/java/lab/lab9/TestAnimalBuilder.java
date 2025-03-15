package lab.lab9;

import java.util.Arrays;
import java.util.List;

public class TestAnimalBuilder {
    public static void main(String[] args) {
        Animal eagle = new Animal.Builder().setName("Eagle").setFlyable(true).build();
        Animal tiger = new Animal.Builder().setName("Tiger").setFlyable(false).build();
        Animal falcon = new Animal.Builder().setName("Falcon").setFlyable(true).build();
        Animal snake = new Animal.Builder().setName("Snake").setFlyable(false).build();
        Animal horse = new Animal.Builder().setName("Horse").setFlyable(false).build();
        Animal dog = new Animal.Builder().setName("Dog").setFlyable(false).build();
        Animal anonymous = new Animal.Builder().build();


        List<Animal> animalList = Arrays.asList(eagle, tiger, falcon, snake, horse, dog, anonymous);
        System.out.println("List animals: " + animalList);

        ControllerAnimalBuilder.race(animalList);

    }
}
