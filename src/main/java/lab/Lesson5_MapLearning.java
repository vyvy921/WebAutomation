package lab;

import java.util.*;

public class Lesson5_MapLearning {
    public static void main(String[] args) {

        //mapLearning();
        mapFinding();

    }

    static void mapLearning() {
        Map<Integer, String> emergencyList = new HashMap<>();

        //Add, display value
        emergencyList.put(113, "CSCD");
        emergencyList.put(114, "Cuu Hoa");
        emergencyList.put(115, "Cap Cuu");
        emergencyList.put(116, "Others");

        System.out.println(emergencyList.get(113));

        System.out.println(emergencyList.keySet());

        for (int key : emergencyList.keySet())
            System.out.println(emergencyList.get(key));


        //Replace
        emergencyList.replace(113, "new 113");
        emergencyList.replace(114, "nothing", "new 114"); //Vao Key 114, tim gia tri "nothing", neu co thi replace thanh "new 114"
        emergencyList.replace(115, "Cap Cuu", "new 115");


        System.out.println("After using Replace");
        for (int key : emergencyList.keySet())
            System.out.println(emergencyList.get(key));


        //Remove
        emergencyList.remove(113);
        emergencyList.remove(116, "Cap Cuu");
        System.out.println("After using Remove");
        for (int key : emergencyList.keySet())
            System.out.println(emergencyList.get(key));
    }

    static void mapFinding() {
        //Update cac key chua gia tri "Others"

        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "CSCD");
        emergencyList.put(114, "Cuu Hoa");
        emergencyList.put(115, "Cap Cuu");
        emergencyList.put(116, "Others");
        emergencyList.put(117, "Others");

        System.out.println("Before using Find");
        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }

        //Tao 1 Set cac key
        //Loop qua set, neu value = Others thi replace

        Set<Integer> keySetEmer = new HashSet<>();
        keySetEmer = emergencyList.keySet();
        System.out.println("After using Find");
        for (int key : keySetEmer) {
            emergencyList.replace(key, "Others", "new");
            System.out.println(emergencyList.get(key));
        }
    }

    static void concurrentModificationException(){
        /**Nguyen nhan: khi duyet danh sach, Java su dung Iterator ngam, nen khi xoa 1 phan tu ra khoi danh sach
         * Iterator van giu tham chieu den dsach cu, kiem Iterator ktra ptu tiep theo thi se phat hien ra dsach da bi
         * thay doi ma khong thong qua Iterator, nen se mem ra ConcurrentModificationException
        */
        //Iterator: la 1 interface, giong nhu con tro duyet danh sach
        //Khac phuc: chuyen sang Iterator va remove qua entry cua Itorator do

    }
}