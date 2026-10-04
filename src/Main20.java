import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Main20 main = new Main20();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String result = main.calc(input);
        System.out.println(result);
    }

    public static String calc(String input) {
        String[] numbers = input.split(" ");
        if(numbers.length != 3) {
            throw new RuntimeException("anus");
        }
        String number1 = numbers[0];
        String sign = numbers[1];
        String number2 = numbers[2];


        if(isNumberArab(number1) && isNumberArab(number2)) {
            int n1 = Integer.parseInt(number1);
            int n2 = Integer.parseInt(number2);

            if(n1 < 1 || n1 > 10 || n2 < 1 || n2 > 10) {
                throw new RuntimeException("жопа");
            }

            return String.valueOf(calcArab(n1, n2, sign));
        } else if (isNumberRoman(number1) && isNumberRoman(number2)) {
            return String.valueOf(calcRoman(number1, number2, sign));
        }
        throw new RuntimeException("anus");
    }

    private static boolean isNumberArab(String number) {
        List<String> arabNumbers = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        return arabNumbers.contains(number);
    }

    private static boolean isNumberRoman(String number) {
        List<String> romanNumbers = List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");
        return romanNumbers.contains(number);
    }

    private static int calcArab(int n1, int n2, String sign) {
        return switch (sign) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> throw new RuntimeException("Пользователь ввёл какую-то залупу");
        };
    }

    private static String calcRoman(String number1, String number2, String sign) {
        Map<String, Integer> romanToArab = Map.of(
                "I", 1,
                "II", 2,
                "III", 3,
                "IV", 4,
                "V", 5,
                "VI", 6,
                "VII", 7,
                "VIII", 8,
                "IX", 9,
                "X",10
        );
        int n1 = romanToArab.get(number1);
        int n2 = romanToArab.get(number2);

        int result = calcArab(n1, n2, sign);
        if(result < 1) {
            throw new RuntimeException("zalupa");
        }
        return arabToRoman(result);
    }

    private static String arabToRoman(int number) {
        String[] roman = {
                "","I","II","III","IV","V","VI","VII","VIII","IX","X",
                "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
                "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
                "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
                "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
                "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
                "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
                "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
                "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC",
                "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"
        };
        return roman[number];
    }
}

