package com.company;

import com.company.util.DoubleArrayUtil;

public class Task2 {

    private static final DoubleArrayUtil arrayUtil = new DoubleArrayUtil();

    public static void main(String[] args) {
        double[] array = arrayUtil.createAndFillArray();
        arrayUtil.printArray(array);
        System.out.println("Max is " + findMax(array));
    }

    protected static double findMax(double[] array) {
        double max = array[0];
        for (double elem : array) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }
}