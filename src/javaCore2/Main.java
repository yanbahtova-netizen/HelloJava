package javaCore2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    static class AsciiCharSequence implements CharSequence {
        byte[] array;

        public AsciiCharSequence(byte[] array) {
            this.array = array;
        }

        @Override
        public int length() {
            return array.length;
        }

        @Override
        public char charAt(int index) {
            return (char) array[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            byte[] newArray = Arrays.copyOfRange(array, start, end);
            return new AsciiCharSequence(newArray);
        }

        @Override
        public String toString() {
//            char[] charArray = new char[array.length];
//            for (int i = 0; i < array.length; i++) {
//                charArray[i] = (char) array[i];
//            }
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < charArray.length; i++) {
//                sb.append(charArray[i]);
//            }
//            return sb.toString();

            String s = new String(array, StandardCharsets.US_ASCII);
            return s;
        }
    }
}
