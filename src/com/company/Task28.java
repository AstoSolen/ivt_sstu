package com.company;

import com.company.util.MatrixUtil;

public class Task28 {

    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.createAndFillMatrix(5);
        MatrixUtil.printMatrix(matrix);
        System.out.println("Sum is " + findSum(matrix));
    }

    protected static int findSum(int[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    result += matrix[i][j];
                }
            }
        }
        return result;
    }
}