package lab.lab7_2;

import java.util.List;

public class ControllerAnimal {

    public static void race(List<Animal> animalList) {

        Animal winner = null;
        int winnerSpeed = 0;

        System.out.println("List animal");
        System.out.println(animalList);

        for (int index = 0; index < animalList.size(); index++) {
            if (animalList.get(index).getSpeed() > winnerSpeed) {
                winner = animalList.get(index);
                winnerSpeed = animalList.get(index).getSpeed();
            }
        }

        System.out.println("\nList animal after race:");
        System.out.println(animalList);
        System.out.println("\nThe winner is " + winner);
    }
}
