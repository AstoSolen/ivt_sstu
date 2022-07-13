package com.company;

import com.company.util.IntegerArrayUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Task26 {

    private static final IntegerArrayUtil arrayUtil = new IntegerArrayUtil();

    public static void main(String[] args) {
        int[] array = arrayUtil.createAndFillArray();
        arrayUtil.printArray(array);

        int[] sortedByASC = sort(array, true);
        System.out.print("Sorted by ascending: ");
        arrayUtil.printArray(sortedByASC);

        int[] sortedByDESC = sort(array, false);
        System.out.print("Sorted by descending: ");
        arrayUtil.printArray(sortedByDESC);

        int[] bubbleSortedByASC = bubbleSort(array, true);
        System.out.print("Bubble sorted by ascending: ");
        arrayUtil.printArray(bubbleSortedByASC);

        int[] bubbleSortedByDESC = bubbleSort(array, false);
        System.out.print("Bubble sorted by descending: ");
        arrayUtil.printArray(bubbleSortedByDESC);
    }

    protected static int[] sort(int[] array, boolean byASC) {
        Stream<Integer> boxed = Arrays.stream(array).boxed();

        boxed = byASC ?
                boxed.sorted() :
                boxed.sorted(Collections.reverseOrder());

        return boxed
                .mapToInt(Integer::intValue)
                .toArray();
    }

    protected static int[] bubbleSort(int[] origin, boolean byAsc) {
        int[] copy = Arrays.copyOf(origin, origin.length);

        int temp;
        if (byAsc) {
            for (int i = 0; i < copy.length - 1; i++) {
                for (int j = 0; j < copy.length - 1 - i; j++) {
                    if (copy[j] > copy[j + 1]) {
                        temp = copy[j];
                        copy[j] = copy[j + 1];
                        copy[j + 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < copy.length - 1; i++) {
                for (int j = 0; j < copy.length - 1 - i; j++) {
                    if (copy[j] < copy[j + 1]) {
                        temp = copy[j];
                        copy[j] = copy[j + 1];
                        copy[j + 1] = temp;
                    }
                }
            }
        }

        return copy;
    }
}