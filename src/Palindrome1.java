public class Palindrome1 {
    public static boolean isPalindrome(int [] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[i] != arr[arr.length - 1 - i]) {
                System.out.println("Палиндром? " + false);
                return false;
            }
        }
        System.out.println("Палиндром? " + true);
        return true;
    }

    public static void main(String[] args) {
        Palindrome1.isPalindrome(new int[] {1, 2, 3, 2, 1});
    }
}
