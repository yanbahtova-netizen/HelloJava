public class Massiv {
    static void fillAndPrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            arr[i] = i*i;
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Massiv.fillAndPrintArray(new int[5]);
    }
}
