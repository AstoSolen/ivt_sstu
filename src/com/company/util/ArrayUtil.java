package com.company.util;

import java.util.Random;

public interface ArrayUtil<T> {

    int DEFAULT_SIZE = 10;
    Random RANDOM = new Random();

    T createAndFillArray();

    T createAndFillArray(int size);

    void printArray(T array);
}