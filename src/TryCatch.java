public class TryCatch {
    public static void testCathException(int a, int b) {
        try {
            int result = a / b;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("На 0 делить нельзя");
        }
    }

    public static void main(String[] args) {
        testCathException(6,0);
    }
}
