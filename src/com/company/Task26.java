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
}