package logic;

import validation.Validation;

public class Generation {

    private int[][] matrix;

    public int[][] inputMatrix(int n) {
        System.out.println("Matrix" + n);
        int row = Validation.getInteger(
                1,
                Integer.MAX_VALUE,
                "Enter number of row: ",
                "Enter a number in range",
                "Enter a number in correct format"
        );
        int column = Validation.getInteger(
                1,
                Integer.MAX_VALUE,
                "Enter number of column: ",
                "Enter a number in range",
                "Enter a number in correct format"
        );
        matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = Validation.getInteger(
                        1,
                        Integer.MAX_VALUE,
                        "Enter Matrix" + n + "[" + (i + 1) + "]" + "[" + (j + 1) + "]: ",
                        "Enter a number in range",
                        "Enter a number in correct format"
                );
            }
        }
        return matrix;
    }

    public void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }
}
