package com.company;

import com.company.util.MatrixUtil;

public class Task13 {

    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.createAndFillMatrix(5);
        MatrixUtil.printMatrix(matrix);
        System.out.println("Average is " + findAvg(matrix));
    }

    protected static double findAvg(int[][] matrix) {
        double result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == (matrix.length - 1) - j) {
                    result += matrix[i][j];
                }
            }
        }
        return result / matrix[0].length;
    }
}