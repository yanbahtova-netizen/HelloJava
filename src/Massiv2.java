public class Massiv2 {
    public static void printArray(int[] array) {
        fillArray(array);
        for (int value : array) {
            System.out.println(value);
        }
    }
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] = i*i;
        }
    }

    public static void main(String[] args) {
        Massiv2.printArray(new int [] {1,2,3});
    }
}
