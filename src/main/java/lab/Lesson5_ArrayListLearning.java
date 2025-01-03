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

        get3MinValue();
    }

    public static void get3MinValue(){
        /*
        * arrange from min -> max
        * filter duplicated values
        * get 3 firsts values
        * */
        List<Integer> myArr = new ArrayList<>();
        myArr.add(3);
        myArr.add(1);
        myArr.add(6);
        myArr.add(4);
        myArr.add(6);
        myArr.add(1);
        myArr.add(2);
        myArr.add(1);
        myArr.add(4);

        System.out.println("Initialization: ");
        System.out.println(myArr);

        System.out.println("After arranging: ");
        int min, tmp;
        for (int indexSorted = 0; indexSorted < myArr.size(); indexSorted++) {
            for (int indexUnsorted = indexSorted + 1; indexUnsorted < myArr.size(); indexUnsorted++) {
                if (myArr.get(indexUnsorted) < myArr.get(indexSorted)){
                    min = myArr.get(indexUnsorted);
                    tmp = myArr.get(indexSorted);
                    myArr.set(indexSorted, min);
                    myArr.set(indexUnsorted, tmp);
                }
            }

        }
        System.out.println(myArr);

        System.out.println("After filter");
        List<Integer> filteredList = new ArrayList<>();
        filteredList.addAll(myArr);
        System.out.println(filteredList);

        for (int index = 0; index < filteredList.size(); index++) {
            for (int pointer = index + 1; pointer < filteredList.size(); pointer++) {
                if (filteredList.get(index).equals(filteredList.get(pointer))) {
                    filteredList.remove(index + 1);
                    pointer--;
                }
            }
        }


        System.out.println(filteredList);
    }

}
