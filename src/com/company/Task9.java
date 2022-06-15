package com.company;

import com.company.util.DoubleArrayUtil;

public class Task9 {

    private static final DoubleArrayUtil arrayUtil = new DoubleArrayUtil();

    public static void main(String[] args) {
        double[] array = arrayUtil.createAndFillArray();
        arrayUtil.printArray(array);
        System.out.println("Min is " + findMin(array));
    }

    protected static int findMin(double[] array) {
        int minIndex = 0;
        double min = array[minIndex];
        for (int i = 0; i < array.length; i++) {
            double elem = array[i];
            if (elem < min) {
                min = elem;
                minIndex = i;
            }
        }
        return minIndex;
    }
}