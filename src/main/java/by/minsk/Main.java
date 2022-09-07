package by.minsk;

public class Main {

    private static int [] array = {2,3,2,4,7,5,5,1,4,3};

    public static void main(String[] args) {
        System.out.print("Array: ");
        print(array);
        System.out.println("\nThe second non-repeatable number in array is " + getSecondNonRepeatableNumber(array));
    }

    private static int getSecondNonRepeatableNumber(int[] array) {
        int count = 0;
        for (int i : array) {
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
