package javaCore6;

public class Zalupa {
    public static NumberGenerator<? super Number> getGenerator() {
        return x -> x.intValue() > 0;
    }
}
interface NumberGenerator <T extends Number> {
    boolean cond(T arg);
}