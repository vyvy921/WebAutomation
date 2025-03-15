package lab.lab10_2;

import java.util.Comparator;

public class SortByName implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
