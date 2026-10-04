import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

//public class Program {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String statement = scanner.nextLine();
//        String result = calc(statement);
//        System.out.println(result);
//    }
//
//    public static String calc(String input) {
//        String[] splittedInput = input.split(" ");
//        if (splittedInput.length != 3) {
//            throw new IllegalArgumentException("Неправильный формат операции");
//        }
//
//        String operationType = splittedInput[1];
//        String firstStringArg = splittedInput[0];
//        String secondStringArg = splittedInput[2];
//        boolean firstArgIsRoman = RomanHelper.isRoman(firstStringArg);
//        boolean secondArgIsRoman = RomanHelper.isRoman(secondStringArg);
//        if (firstArgIsRoman != secondArgIsRoman) {
//            throw new IllegalArgumentException("Аргументы имеют разные формат");
//        }
//
//        int firstArg = Convertor.convert(firstStringArg);
//        int secondArg = Convertor.convert(secondStringArg);
//        if (firstArg < 1) {
//            throw new IllegalArgumentException(firstArg + " меньше единицы");
//        }
//        if (secondArg < 1) {
//            throw new IllegalArgumentException(secondArg + " меньше единицы");
//        }
//
//        int result = 0;
//        switch (operationType) {
//            case "+": {
//                result = firstArg + secondArg;
//                break;
//            }
//            case "-": {
//                result = firstArg - secondArg;
//                break;
//            }
//            case "*": {
//                result = firstArg * secondArg;
//                break;
//            }
//            case "/": {
//                result = firstArg / secondArg;
//                break;
//            }
//        }
//
//        if (firstArgIsRoman) {
//            if (result < 1) {
//                throw new IllegalArgumentException("Результат для римских цифр может быть только положительным");
//            }
//            return RomanHelper.intToRoman(result);
//        }
//
//        return Integer.toString(result);
//    }
//}
//
//class Convertor {
//    static int convert (String value) {
//        if (RomanHelper.isRoman(value)) {
//            return RomanHelper.romanToInt(value);
//        }
//        else {
//            try {
//                return Integer.parseInt(value);
//            }
//            catch (NumberFormatException _) {
//                throw new IllegalArgumentException(value + " не является ни римской цифрой, ни целой арабской цифрой");
//            }
//        }
//    }
//}
//
//class RomanHelper {
//    static Map<Character, Integer> values = Map.of(
//            'I', 1,
//            'V', 5,
//            'X', 10,
//            'L', 50,
//            'C', 100,
//            'D', 500,
//            'M', 1000
//    );
//
//    static boolean isRoman (String s) {
//        return Pattern.matches("^[IVXLCDM]+$", s.toUpperCase());
//    }
//
//    static int romanToInt(String value) {
//        int result = 0;
//        int prevValue = 0;
//
//        for (int i = value.length() - 1; i >= 0; i--) {
//            char ch = value.charAt(i);
//            Integer currentValue = values.get(ch);
//            if (currentValue == null) {
//                throw new IllegalArgumentException("Неверная римская цифра: " + ch);
//            }
//
//            if (currentValue < prevValue) {
//                result -= currentValue;
//            } else {
//                result += currentValue;
//            }
//
//            prevValue = currentValue;
//        }
//
//        return result;
//    }
//
//    static String intToRoman(int value) {
//        int[] values = {10, 9, 5, 4, 1};
//        String[] symbols = {"X", "IX", "V", "IV", "I"};
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < values.length; i++) {
//            while (value >= values[i]) {
//                sb.append(symbols[i]);
//                value -= values[i];
//            }
//        }
//
//        return sb.toString();
//    }
//}
