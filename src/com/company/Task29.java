package com.company;

import com.company.util.MatrixUtil;

public class Task29 {

    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.createAndFillMatrix(5, 6);
        MatrixUtil.printMatrix(matrix);

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        MatrixUtil.printMatrix(transpose(matrix));
    }

    protected static int[][] transpose(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                transposedMatrix[j][i] = row[j];
            }
        }

        return transposedMatrix;
    }
}