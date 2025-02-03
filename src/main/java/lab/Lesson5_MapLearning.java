package lab;

import java.util.*;

public class Lesson5_MapLearning {
    public static void main(String[] args) {

        Map<Integer, String> emergencyList = new HashMap<>();

        emergencyList.put(113, "CSCD");
        emergencyList.put(114, "Cuu Hoa");
        emergencyList.put(115, "Cap Cuu");
        emergencyList.put(116, "Others");

        System.out.println(emergencyList.get(113));

        System.out.println(emergencyList.keySet());

        for (int key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }

    }


}
