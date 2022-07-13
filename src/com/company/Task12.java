package com.company;

import com.company.util.IntegerArrayUtil;

public class Task12 {

    private static final IntegerArrayUtil arrayUtil = new IntegerArrayUtil();

    public static void main(String[] args) {
        int[] array = arrayUtil.createAndFillArray();
        arrayUtil.printArray(array);
        System.out.println("Multiplication is " + findMultiplication(array));
    }

    protected static int findMultiplication(int[] array) {
        int result = 1;
        for (int elem : array) {
            if (elem % 2 == 0 && elem != 0) {
                result *= elem;
            }
        }
        return result;
    }
}