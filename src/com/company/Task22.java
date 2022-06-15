package com.company;

import com.company.util.DoubleArrayUtil;

public class Task22 {

    private static final DoubleArrayUtil arrayUtil = new DoubleArrayUtil();

    public static void main(String[] args) {
        double[] array = arrayUtil.createAndFillArray();
        arrayUtil.printArray(array);
        System.out.println("Min is " + findMin(array));
    }

    protected static double findMin(double[] array) {
        double min = array[0];
        for (double elem : array) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }
}