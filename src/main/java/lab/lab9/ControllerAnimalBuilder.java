package lab.lab9;

import java.util.ArrayList;
import java.util.List;

public class ControllerAnimalBuilder {

    private static List<Animal> filerAnimalCanRace(List<Animal> animalsDummy) {

        List<Animal> animalList = new ArrayList<>();

        for (Animal animal : animalsDummy)
            if (!animal.isFlyable())
                animalList.add(animal);

        return animalList;
    }

    public static void race(List<Animal> animalList) {

        System.out.println("Animals before filter\n" + animalList);
        animalList = filerAnimalCanRace(animalList);

        Animal winner = null;
        int winerRace = 0;

        for (int index = 0; index < animalList.size(); index++)
            if (animalList.get(index).getSpeed() > winerRace) {
                winner = animalList.get(index);
                winerRace = animalList.get(index).getSpeed();
            }
        System.out.println("Animals after filter\n" + animalList);
        System.out.println("The winner is: " + winner);

    }
}
