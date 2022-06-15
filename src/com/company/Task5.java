package com.company;

import com.company.util.DoubleArrayUtil;

public class Task5 {

    private static final DoubleArrayUtil arrayUtil = new DoubleArrayUtil();

    public static void main(String[] args) {
        double[] array = arrayUtil.createAndFillArray();
        arrayUtil.printArray(array);
        System.out.println("index is " + findLast(array, array[1]));
    }

    protected static int findLast(double[] array, double toFind) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
}