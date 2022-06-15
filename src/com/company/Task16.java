package com.company;

import com.company.util.DoubleArrayUtil;

public class Task16 {

    private static final DoubleArrayUtil arrayUtil = new DoubleArrayUtil();

    public static void main(String[] args) {
        double[] array = arrayUtil.createAndFillArray();
        arrayUtil.printArray(array);
        System.out.println("Multiplication is " + findMultiplication(array));
    }

    protected static double findMultiplication(double[] array) {
        double result = 1;
        for (double elem : array) {
            if (elem < 0) {
                result *= elem;
            }
        }
        return result;
    }
}