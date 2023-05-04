package logic;

import java.util.Random;

public class BinarySearch {

    private int integerArray[];

    /**
     * Display an array
     */
    public void displayArray() {
        System.out.print("[");
        for (int i = 0; i < integerArray.length; i++) {
            if (i != integerArray.length - 1) {
                System.out.print(integerArray[i] + ", ");
            } else {
                System.out.print(integerArray[i] + "]\n");
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

    /**
     * Search a value in sorted array
     *
     * @param searchNumber number input from the keyboard
     * @param left         index of left boundary
     * @param right        index of right boundary
     * @return the index of value in array. If not return -1
     */
    public int binarySearch(int searchNumber, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (integerArray[middle] == searchNumber) {
            return middle;
        } else if (integerArray[middle] > searchNumber) {
            return binarySearch(searchNumber, left, middle - 1);
        } else {
            return binarySearch(searchNumber, middle + 1, right);
        }
    }
    
    /**
     * Display the index of searchNumber in array
     * @param searchNumber number input from the keyboard
     */
    public void displayIndex(int searchNumber) {
        int indexFound = binarySearch(searchNumber, 0, integerArray.length - 1);
        if (indexFound != -1) {
            System.out.println("\nFound " + searchNumber + " at index: " + indexFound);
        } else {
            System.out.println("\nNot found " + searchNumber + " in array.");
        }
        System.out.println("");
    }
}
