package com.company.util;

import java.util.Random;

public class MatrixUtil {

    private static final Random RANDOM = new Random();

    public static int[][] createAndFillMatrix() {
        return createAndFillMatrix(5, 6);
    }

    public static int[][] createAndFillMatrix(int n) {
        return createAndFillMatrix(n, n);
    }

    public static int[][] createAndFillMatrix(int n, int m) {
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = RANDOM.nextInt(21) - 10;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            for (int elem : array) {
                System.out.printf("%4d", elem);
            }
            System.out.println();
        }
    }
}