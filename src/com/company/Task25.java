package com.company;

import com.company.util.IntegerArrayUtil;

public class Task25 {

    private static final IntegerArrayUtil arrayUtil = new IntegerArrayUtil();

    public static void main(String[] args) {
        int[] array = {3, 3, 5, 6, 7, 6, 6, 7, 7, 7, 6, 4, 3, 2, 9, 9, 9, 9};
        arrayUtil.printArray(array);
        System.out.println("index is " + findIndex(array));
    }

    protected static int findIndex(int[] array) {
        int counter;
        int minLength = array.length;
        int minLengthIndex = 0;
        for (int i = 0; i < array.length; i++) {
            counter = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                } else {
                    break;
                }
            }

            if (counter >= 1 && counter < minLength) {
                minLength = counter;
                minLengthIndex = i;
            }
        }

        return minLengthIndex;
    }
}