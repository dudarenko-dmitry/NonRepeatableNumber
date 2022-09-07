package by.minsk;

import java.util.Arrays;

public class Main {

    private static int [] array = {2,3,9,2,4,7,5,5,1,4,3};

    public static void main(String[] args) {
        System.out.print("Array: ");
        print(array);
        System.out.println("\nThe second non-repeatable number in array is " + getSecondNonRepeatableNumber(array));
    }

    private static int getSecondNonRepeatableNumber(int[] array) {
        int secondNumber = -1;
        int count = 0;
        for(int i = 0; i < array.length - 1; i++){
            int countRepeated = 0;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] == array[i]){
                    countRepeated++;
                }
            }
            if(countRepeated == 0){
                count++;
            }
            if(count == 2){
                return array[i];
            }
        }
        return secondNumber;
    }

    private static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }
}
