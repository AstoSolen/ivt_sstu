package com.company;

import com.company.util.DoubleArrayUtil;

public class Task15 {

    private static final DoubleArrayUtil arrayUtil = new DoubleArrayUtil();

    public static void main(String[] args) {
        double[] array = arrayUtil.createAndFillArray();
        arrayUtil.printArray(array);
        System.out.println("Max is " + findMax(array));
    }

    protected static int findMax(double[] array) {
        int maxIndex = 0;
        double max = array[maxIndex];
        for (int i = 0; i < array.length; i++) {
            double elem = array[i];
            if (elem > max) {
                max = elem;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}