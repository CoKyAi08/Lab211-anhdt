package main;

import sort.BubbleSort;
import validation.Validation;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int size = Validation.getInteger(
                1,
                Integer.MAX_VALUE,
                "Enter number of array: ",
                "Enter a number in range",
                "Enter a number in correct format"
        );
        bubbleSort.generate(size);
        System.out.print("\nUnsorted array: ");
        bubbleSort.display();
        bubbleSort.sort();
        System.out.print("\nSorted array: ");
        bubbleSort.display();
    }
}
