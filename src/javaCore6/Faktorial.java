package javaCore6;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Faktorial {
    public static BigInteger factorial(int value) {
        return IntStream.rangeClosed(1, value)
                .mapToObj(i -> BigInteger.valueOf(i))
                .reduce(BigInteger.ONE, (a, b) -> a.multiply(b));
    }

}
