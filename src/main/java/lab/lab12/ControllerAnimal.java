package lab.lab12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ControllerAnimal {

    public static void filterAnimalCanRun(List<Animal> animals) {

        List<Animal> filteredAnimals = new ArrayList<>();

        for (Animal animal : animals)
            if (animal.getSpeed() >= 0)
                filteredAnimals.add(animal);

        System.out.println("After filtering");
        System.out.println(filteredAnimals);

        Collections.sort(filteredAnimals, new SortBySpeed());
        System.out.println("After sorting");
        System.out.println(filteredAnimals);

    }

}
