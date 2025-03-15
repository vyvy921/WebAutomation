package lab.lab12;

import java.util.Comparator;

public class SortBySpeed implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getSpeed() - a2.getSpeed();
    }
}
