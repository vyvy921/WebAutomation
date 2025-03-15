package lab;

public class Lab_learning {
    public static void main(String[] args) {
        int[] numberArr = new int[5];

        for (int index = 0; index < numberArr.length; index++) {
            numberArr[index] = index++;
        }

        for (int index = 0; index < numberArr.length; index++) {
            System.out.printf("Element at index %d is %d \n",index, numberArr[index]);
        }
        /*n[0] = 0 index = 1, index++ = 2 < 5
        *n[2] = 2 index = 3, index++ = 4 < 5
        *n[4] = 4 index = 5, index++ = 6
        * /
        * n[0] = 0
        * n[1] = 0
        * n[2] = 2
        * n[3] = 0
        * n[4] = 4
        *
         */
        for (int index = 0; index < 5; index++) {

            if (index == 2){
                break;
            }
            System.out.println(index);
        }

        for (int index = 0; index < 5; index++) {

            System.out.println(index);
        }
    }
}
