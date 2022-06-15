package com.company;

import com.company.util.IntegerArrayUtil;

public class Task24 {

    private static final IntegerArrayUtil arrayUtil = new IntegerArrayUtil();

    public static void main(String[] args) {
        int[] array = {5, 6, 7, 6, 6, 7, 7, 7, 6, 4, 3, 2, 9, 9, 9, 9};
        arrayUtil.printArray(array);
        System.out.println("index is " + findIndex(array));
    }

    protected static int findIndex(int[] array) {
        int counter;
        int maxLength = 0;
        int maxLengthIndex = 0;
        for (int i = 0; i < array.length; i++) {
            counter = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                } else {
                    break;
                }
            }

            if (counter > maxLength) {
                maxLength = counter;
                maxLengthIndex = i;
            }
        }

        return maxLengthIndex;
    }
}