package com.company;

import com.company.util.MatrixUtil;

public class Task21 {

    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.createAndFillMatrix(7);
        MatrixUtil.printMatrix(matrix);
        System.out.println("Average is " + findAvg(matrix));
    }

    protected static double findAvg(int[][] matrix) {
        double sum = 0;
        double count = 0;

        for (int i = matrix.length / 2; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                int elem = row[j];
                if (j > (row.length - i - 1) && j < i) {
                    sum += elem;
                    count++;
                }
            }
        }

        return sum / count;
    }
}