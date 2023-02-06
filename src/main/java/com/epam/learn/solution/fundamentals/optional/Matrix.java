package com.epam.learn.solution.fundamentals.optional;

public class Matrix {
    static int [][] matrix;
    public static void main(String[] args) {
        MatrixLogic matrixLogic = new MatrixLogic();
        matrixLogic.getMatrix(matrixLogic.getMatrixDimension(), matrixLogic.getMatrixInterval());
        matrixLogic.printMatrix(matrix);
        System.out.println("_____________________________");
        matrixLogic.getSumBetweenFirstAndSecondPositiveElements(matrix);
        System.out.println("_____________________________");
        matrixLogic.getIncreasingSequences();
        matrixLogic.getDescendingSequences();
        System.out.println("_____________________________");
        matrixLogic.getValueElementK();
        matrixLogic.getSortColumn();
        matrixLogic.printMatrix(matrix);
        matrixLogic.getSortRow();
        matrixLogic.printMatrix(matrix);
        System.out.println("_____________________________");
        matrixLogic.printMatrix(matrixLogic.removeRowsAndColumnsContainingMaximalElement(matrix));
    }
}
