package com.company;

import com.company.util.MatrixUtil;

public class Task23 {

    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.createAndFillMatrix(5);
        MatrixUtil.printMatrix(matrix);
        System.out.println("Average is " + findAvg(matrix));
    }

    protected static double findAvg(int[][] matrix) {
        double result = 0;
        for (int[] array : matrix) {
            for (int element : array) {
                result += element;
            }
        }

        return result / (matrix.length * matrix[0].length);
    }
}