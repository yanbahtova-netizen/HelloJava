public class Calc {
    static void calculateResult(double x, double y) {
        System.out.println( x * y);
    }

    static void calculateResult(int x, int y) {
        System.out.println(x / y);
    }

    public static void main(String[] args) {
        Calc.calculateResult(10.6,2.9);
        Calc.calculateResult(10, 2);
    }
}
