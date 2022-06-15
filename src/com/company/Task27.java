package com.company;

import com.company.util.DoubleArrayUtil;

import java.util.Arrays;

public class Task27 {

    private static final DoubleArrayUtil arrayUtil = new DoubleArrayUtil();

    public static void main(String[] args) {
        double[] array = arrayUtil.createAndFillArray();
        arrayUtil.printArray(array);
        System.out.println("Median is " + calculateMedian(array));
    }

    protected static double calculateMedian(double[] array) {
        double[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);

        int middle = sorted.length / 2;
        double medianValue;
        if (sorted.length % 2 == 1) {
            medianValue = sorted[middle];
        } else {
            medianValue = (sorted[middle - 1] + sorted[middle]) / 2;
        }

        return medianValue;
    }
}