package lab;

import java.util.ArrayList;
import java.util.List;

public class Lesson5_ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(4);
        myArrList.add(6);
        myArrList.add(1);
        myArrList.add(4);
        myArrList.add(4);
        myArrList.add(4);
//        myArrList.add(1);
//        myArrList.add(2);
//        myArrList.add(3);
//        myArrList.add(4);
//        myArrList.add(4);
//        myArrList.add(4);
//        myArrList.add(6);
//        myArrList.add(8);
        myArrList.add(6);
        myArrList.add(5);

        /*chuyen myList thanh so chan:
          if soLe -> + 1
          if sochang -> continue
         */
            System.out.println("Before");
        System.out.println(myArrList);

        for (int index = 0; index < myArrList.size(); index++) {
            if (myArrList.get(index) % 2 != 0)
                myArrList.set(index, myArrList.get(index) + 1);
        }

            System.out.println("After");
        System.out.println(myArrList);

        /* remove so 4
        if myList.get() == 4
        myList.remove
        index: 0, 1, 2, 3 | size = 4 3 2 1 0
        * */

        for (int index = 0; index < myArrList.size(); index++) {
            if (myArrList.get(index) == 4){
                myArrList.remove(index);
                index--;
            }
        }

        System.out.println(myArrList);

        System.out.println(myArrList.indexOf(2));
    }
}
