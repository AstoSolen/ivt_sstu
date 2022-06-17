package com.company;

import com.company.util.MatrixUtil;

public class Task18 {

    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.createAndFillMatrix(7);
        MatrixUtil.printMatrix(matrix);
        System.out.println("Average is " + findAvg(matrix));
    }

    protected static double findAvg(int[][] matrix) {
        double sum = 0;
        double count = 0;

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length / 2 + 1; j++) {
                int elem = row[j];
                if (j <= i && j <= matrix.length - 1 - i) {
                    sum += elem;
                    count++;
                }
            }
        }

        return sum / count;
    }
}