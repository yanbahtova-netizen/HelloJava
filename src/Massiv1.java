import java.util.Arrays;

public class Massiv1 {
    static int[] mergeArrays(int[] firstArray, int[] secondArray) {
        int[] result = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);

        for (int i = 0; i < secondArray.length; i++) {
            result[firstArray.length + i] = secondArray[i];
        }
        for (int value: result) {
            System.out.println(value);
        }
        return result;
    }

    public static void main(String[] args) {
        Massiv1.mergeArrays(new int [] {1,2,3}, new int [] {4,5});
    }
}
