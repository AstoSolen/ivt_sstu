package com.company.util;

public class DoubleArrayUtil implements ArrayUtil<double[]> {

    @Override
    public double[] createAndFillArray() {
        return createAndFillArray(DEFAULT_SIZE);
    }

    @Override
    public double[] createAndFillArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = (RANDOM.nextInt(21) - 10) * RANDOM.nextDouble();
        }
        return array;
    }

    @Override
    public void printArray(double[] array) {
        for (double elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
