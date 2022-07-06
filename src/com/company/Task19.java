package com.company;

import com.company.util.IntegerArrayUtil;

public class Task19 {

    private static final IntegerArrayUtil arrayUtil = new IntegerArrayUtil();

    public static void main(String[] args) {
        int[] array = arrayUtil.createAndFillArray();
        arrayUtil.printArray(array);
        System.out.println("Average is " + findAvg(array));
    }

    protected static double findAvg(int[] array) {
        double result = 0;
        for (int elem : array) {
            result += elem;
        }
        return result / array.length;
    }
}