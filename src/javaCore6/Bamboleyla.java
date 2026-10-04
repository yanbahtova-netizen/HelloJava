package javaCore6;

import java.util.stream.IntStream;

public class Bamboleyla {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, x -> x * x / 10 % 1000);
    }
}
