package main;

import logic.BinarySearch;
import validation.Validation;

public class Main {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int size = Validation.getInteger(
                1,
                Integer.MAX_VALUE,
                "Enter number of array: ",
                "Enter a number in range",
                "Enter a number in correct format"
        );
        binarySearch.generate(size);
        binarySearch.sort();
        System.out.print("\nSorted array: ");
        binarySearch.displayArray();
        int searchNumber = Validation.getInteger(
                1,
                Integer.MAX_VALUE,
                "Enter search number: ",
                "Enter a number in range",
                "Enter a number in correct format"
        );
        binarySearch.displayIndex(searchNumber);
    }
}
