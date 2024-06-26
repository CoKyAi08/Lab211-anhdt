package sort;

import java.util.Random;

public class BubbleSort {

    private int integerArray[];

    /**
     * Display an array
     */
    public void display() {
        System.out.print("[");
        for (int i = 0; i < integerArray.length; i++) {
            if (i != integerArray.length - 1) {
                System.out.print(integerArray[i] + ", ");
            } else {
                System.out.print(integerArray[i] + "]");
            }
        }
    }

    /**
     * Generate an integer randomly number
     *
     * @param size array size
     */
    public void generate(int size) {
        Random random = new Random();
        integerArray = new int[size];
        for (int i = 0; i < size; i++) {
            integerArray[i] = random.nextInt(size);
        }
    }

    /**
     * Sort the array by bubble sort
     */
    public void sort() {
        for (int i = 0; i < integerArray.length - 1; i++) {
            for (int j = 0; j < integerArray.length - i - 1; j++) {
                if (integerArray[j] > integerArray[j + 1]) {
                    int temp = integerArray[j];
                    integerArray[j] = integerArray[j + 1];
                    integerArray[j + 1] = temp;
                }
            }
        }
    }
}
