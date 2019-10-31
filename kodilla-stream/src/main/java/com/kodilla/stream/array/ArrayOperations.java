package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);
        OptionalDouble avg = IntStream.rangeClosed(1, 10)
                .average();
        return avg.getAsDouble();
    }
}
