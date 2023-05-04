package logic;

import validation.Validation;

public class Calculator {
    
    Generation generation = new Generation();
    
    int[][] matrix1 = generation.inputMatrix(1);;
    int[][] matrix2 = generation.inputMatrix(2);
    int row1 = matrix1.length;
    int column1 = matrix1[0].length;
    int row2 = matrix2.length;
    int column2 = matrix2[0].length;

    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int matrixResult[][] = new int[row1][column1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixResult;
    }

    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        int matrixResult[][] = new int[row1][column1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                matrixResult[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrixResult;
    }

    public int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] matrixResult = new int[row1][column2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int k = 0; k < row2; k++) {
                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrixResult;
    }
    
    public void display() {
        while (true) {
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            int choice = Validation.getInteger(
                1, 4,
                "Enter your choice: ",
                "Enter a number in range",
                "Enter a number in correct format"
        );
            switch (choice) {
                case 1:
                    if(row1 != row2 || column1 != column2){
                        System.out.println("Can't addition");
                    } else {
                    generation.displayMatrix(matrix1);
                    System.out.println("+");
                    generation.displayMatrix(matrix2);
                    System.out.println("=");
                    generation.displayMatrix(additionMatrix(matrix1, matrix2));
                    }
                    break;
                case 2:
                    if(row1 != row2 || column1 != column2){
                        System.out.println("Can't subtraction");
                    } else {
                    generation.displayMatrix(matrix1);
                    System.out.println("-");
                    generation.displayMatrix(matrix2);
                    System.out.println("=");
                    generation.displayMatrix(additionMatrix(matrix1, matrix2));
                    }
                    break;
                case 3:
                    if(row2 != column1){
                        System.out.println("Can't multiplication");
                    } else {
                    generation.displayMatrix(matrix1);
                    System.out.println("*");
                    generation.displayMatrix(matrix2);
                    System.out.println("=");
                    generation.displayMatrix(additionMatrix(matrix1, matrix2));
                    }
                    break;
                case 4:
                    return;
            }
        }
    }
}
