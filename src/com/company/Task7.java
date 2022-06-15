package com.company;

import com.company.util.DoubleArrayUtil;

public class Task7 {

    private static final DoubleArrayUtil arrayUtil = new DoubleArrayUtil();

    public static void main(String[] args) {
        double[] array = arrayUtil.createAndFillArray();
        arrayUtil.printArray(array);
        System.out.println("count is " + countEqual(array, array[1]));
    }

    protected static int countEqual(double[] array, double toFind) {
        int count = 0;
        for (double elem : array) {
            if (elem == toFind) {
                count++;
            }
        }
        return count;
    }
}