package lab.lab12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Dog", new RunAble());
        Animal animal2 = new Animal("Cat", new RunAble());
        Animal animal3 = new Animal("Bird", new FlyAble());
        Animal animal4 = new Animal("Snake", new RunAble());
        Animal animal5 = new Animal("Butterfly", new FlyAble());

        List<Animal> animals = Arrays.asList(animal1, animal2, animal3, animal4, animal5);
        System.out.println("Before sorting");
        System.out.println(animals);


        ControllerAnimal.filterAnimalCanRun(animals);
    }


}
