package com.epam.learn.solution.fundamentals.optional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixLogic extends Matrix{
    Scanner scanner = new Scanner(System.in);
    int matrixDimension;
    int interval;
    int valueElementK;
    int rowIndex;
    int columnIndex;

    public int getMatrixDimension() {
        System.out.println("Enter dimension matrix: ");
        String line = scanner.nextLine();
        if (!line.isEmpty()) {
            matrixDimension = Integer.parseInt(line);
        }
        return matrixDimension;
    }

    public int getMatrixInterval() {
        System.out.println("Enter interval: ");
        String line = scanner.nextLine();
        if (!line.isEmpty()) {
            interval = Integer.parseInt(line);
        }
        return interval;
    }

    public void getMatrix(int size, int value) {
        Random random = new Random();
        matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(2*value-1)-value;
            }
        }
    }

    public void printMatrix(int [][] matrix) {
        for (int[] array : matrix) {
            for (int nextRow : array) {
                System.out.format("%5d", nextRow);
            }
            System.out.println();
        }
    }

    public void getValueElementK() {
        System.out.println("\nEnter a number from (1 - " + matrixDimension + ") to sort:");
        valueElementK = scanner.nextInt() - 1;
    }

    public void getSortColumn() {
        System.out.println("Sort column " + (valueElementK + 1) + ": ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][valueElementK] > matrix[j][valueElementK]) {
                    int temp = matrix[j][valueElementK];
                    matrix[j][valueElementK] = matrix[i][valueElementK];
                    matrix[i][valueElementK] = temp;
                }
            }
        }
    }

    public void getSortRow() {
        System.out.println("Sort row " + (valueElementK + 1) + ": ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[valueElementK][i] > matrix[valueElementK][j]) {
                    int temp = matrix[valueElementK][j];
                    matrix[valueElementK][j] = matrix[valueElementK][i];
                    matrix[valueElementK][i] = temp;
                }
            }
        }
    }
    public void getIncreasingSequences(){
        System.out.print("Ever-increasing sequences: ");
        boolean next = true;
        for (int [] array : matrix){
            for (int i = 1; i < array.length; i++) {
                if (array[i] <= array[i - 1]){
                    next = true;
                } else if (array[i] > array[i - 1] && next) {
                    System.out.print("\n " + array[i - 1] + ", " + array[i]);
                    next = false;
                }else if (array[i] > array[i - 1] && !next) {
                    System.out.print(", " + array[i]);
                }
            }
        }
    }
    public void getDescendingSequences(){
        System.out.print("\nAll descending sequences: ");
        boolean next = true;
        for (int [] array : matrix) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] >= array[i - 1]){
                    next = true;
                } else if (array[i] < array[i - 1] && next){
                    System.out.print("\n" + array[i - 1] + ", " + array[i]);
                    next = false;
                } else if (array[i] < array[i - 1] && !next) {
                    System.out.print(", " + array[i]);
                }
            }
        }
    }

    public int getMaximalElement(int[][] matrix) {
        int maximalElement = 0;
        for (int[] temp : matrix) {
            for (int i = 0; i < matrix.length; i++) {
                if (maximalElement < temp[i]) {
                    maximalElement = temp[i];
                }
            }
        }
        return maximalElement;
    }

    public boolean getElement(int[][] matrix, int maximalElement) {
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[0].length; i++) {
                if (matrix[j][i] == maximalElement) {
                    rowIndex = j;
                    columnIndex = i;
                    return true;
                }
            }
        }
        return false;
    }

    public static int[][] removeRowAndColumn(int[][] matrix, int row, int column) {
        int[][] result = new int[matrix.length-1][matrix[0].length-1];
        for (int i = 0; i < matrix.length; i++) {
            int newRowIndex = row < i ? i - 1 : i;
            for (int j = 0; j < matrix[i].length; j++) {
                int newColumnIndex = column < j ? j - 1 : j;
                if (row != i && column != j)
                    result[newRowIndex][newColumnIndex] = matrix[i][j];
            }
        }
        return result;
    }

    public int[][] removeRowsAndColumnsContainingMaximalElement(int[][] matrix) {
        int maximalElement = getMaximalElement(matrix);
        System.out.println("Maximum value of elements in the matrix: " + maximalElement);
        while (getElement(matrix, maximalElement)) {
            matrix = removeRowAndColumn(matrix, rowIndex, columnIndex);
        }
        return matrix;
    }
    public void getSumBetweenFirstAndSecondPositiveElements(int [][] matrix) {
        System.out.println("Sum of elements between the first and second positive elements: ");
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int [] array = matrix[i];
            int [] arrayIndex;        //massive indexes between first and second positive elements
            int rowNumber = i + 1;
            int firstIndex = 0;
            int secondIndex = 0;
            int getElement = 0;

            int counter = 0;
            for (int element : array) {
                if (element >= 0){
                    counter++;
                }
            }
            if (counter >= 2){
                for (int j = 0;j < array.length; j++) {
                    if (array[j] >= 0) {
                        firstIndex = j;
                        break;

                    }
                }
                for (int j = firstIndex + 1; j < array.length; j++) {
                    if (array[j] >= 0){
                        secondIndex = j;
                        break;
                    }
                }
                for (int j = firstIndex + 1; j < secondIndex ; j++) {
                    getElement += array[j];
                }
                arrayIndex = new int[secondIndex - (firstIndex + 1)];
                sum += getElement;
                System.arraycopy(array, firstIndex + 1, arrayIndex,0, (secondIndex - (firstIndex + 1)));
                System.out.println("Row: " + rowNumber + ". Sum: " + getElement + ". Element: " + Arrays.toString(arrayIndex));
            }
        }
        System.out.println("Sum of the all: " + sum);
    }
}
