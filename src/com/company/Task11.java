package com.company;

import com.company.util.DoubleArrayUtil;

public class Task11 {

    private static final DoubleArrayUtil arrayUtil = new DoubleArrayUtil();

    public static void main(String[] args) {
        double[] array = arrayUtil.createAndFillArray();
        arrayUtil.printArray(array);
        System.out.println("index is " + findFirst(array, array[1]));
    }

    protected static int findFirst(double[] array, double toFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
}