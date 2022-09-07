package by.minsk;

import java.util.Arrays;

public class Main2 {

    private static int [] array = {2,3,2,4,7,5,5,1,4,3};

    public static void main(String[] args) {
        System.out.println("Array: ");
        print(array);
        System.out.println("\nThe second non-repeatable number in array is " + getSecondNonRepeatableNumber(array));
    }

    private static int getSecondNonRepeatableNumber(int[] array){
        int count = 0;
        int[] arrayUnique = Arrays.stream(array).distinct().toArray();
        for (int i : arrayUnique) {
            int countRepeat = 0;
            for (int j : array) {
                if (i == j) {
                    countRepeat++;
                }
            }

            if (countRepeat == 1) {
                count++;
            }

            if (count == 2) {
                return i;
            }
        }
        return -1;
    }

    private static void print(int[] array){
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
