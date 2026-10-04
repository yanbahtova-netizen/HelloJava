public class IfElse {
    public static int incrementIfPositive(int a) {
        if(a>0) {
            a++;
        }
        return a;
    }

    public static void main(String[] args) {
        incrementIfPositive(7);
    }
}
