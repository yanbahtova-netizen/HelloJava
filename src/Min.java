public class Min {
    public static int getMinFromTwo(int x, int y) {
        int[] numbers = {x, y};
        int min = Integer.MAX_VALUE;
        for (int num: numbers) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int getMinFromFour(int x, int y, int m, int n) {
        int min1 = getMinFromTwo(x, y);
        int min2 = getMinFromTwo(m, n);
        return getMinFromTwo(min1,min2);
    }

    public static void main(String[] args) {
        getMinFromTwo(2, 6);
        getMinFromFour(2, 6, 8, 10);
    }
}
