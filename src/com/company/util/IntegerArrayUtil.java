package com.company.util;

public class IntegerArrayUtil implements ArrayUtil<int[]> {

    @Override
    public int[] createAndFillArray() {
        return createAndFillArray(DEFAULT_SIZE);
    }

    @Override
    public int[] createAndFillArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(21) - 10;
        }
        return array;
    }

    @Override
    public void printArray(int[] array) {
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
