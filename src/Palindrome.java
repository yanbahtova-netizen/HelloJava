import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Palindrome {
        public static boolean isPalindrome(String text) {
            String s = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String s1 = new StringBuilder(s).reverse().toString();
            return s.equals(s1);
        }

    public static void main(String[] args) {
        Palindrome.isPalindrome("Was it a cat I saw?");
    }
}
//            List<Character> list = new LinkedList<>();
//            for(char ch: s.toCharArray()) {
//                list.add(ch);
//            }
//            ListIterator<Character> iterator1 = list.listIterator();
//            ListIterator<Character> iterator2 = list.listIterator(list.size());
//            boolean isPalindrom = true;
//            while ((iterator1.hasNext() && iterator2.hasPrevious())) {
//                if (iterator1.next() != iterator2.previous()) {
//                    isPalindrom = false;
//                    System.out.println(false);
//                    break;
//                } else {
//                    System.out.println(true);
//                }
//            }
//            return isPalindrom;