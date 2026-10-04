import java.math.BigInteger;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArithmeticCalculations {
    public int drawisMonitorsCounter(int monitors, int programmers) {
        int result = monitors % programmers;
        System.out.println(result);
        return result;
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) <= 0.0001;
    }

    public static void calcCircleRadius(double area) {
        double r = Math.sqrt(area / Math.PI);
        System.out.printf("%.3f", r);
    }

    public static void maxLongSqr() {
        long max = Long.MAX_VALUE;
        BigInteger bigMax = BigInteger.valueOf(max);
        BigInteger square = bigMax.multiply(bigMax);
        System.out.println(square);
    }

    public static char charExpression(int a) {
        String s = "\\";
        int codePoint = s.codePointAt(0);
        char c = (char) (codePoint + a);
        return c;
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        int i = Math.abs(age2 - age1);
        byte result = (byte) i;
        return result;
    }

    public static boolean isPowerOfTwo(int value) {
        int i = Math.abs(value);
        if (Integer.bitCount(i) == 1) {
            return true;
        }
        return false;
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger factorial1(int value) {
        if (value <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(value).multiply(factorial1(value - 1));
    }

    public int determineGroup(int age) {
        if (age >= 7 && age <= 13) {
            System.out.println(1);
            return 1;
        }
        if (age >= 14 && age <= 17) {
            System.out.println(2);
            return 2;
        }
        if (age >= 18 && age <= 65) {
            System.out.println(3);
            return 3;
        } else System.out.println(-1);
        return -1;
    }

    public static boolean isWeekend(String weekday) {
        return switch (weekday) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> false;
            case "Saturday", "Sunday" -> true;
            default -> false;
        };
    }

    public static boolean isWeekend1(String weekday) {
        if (weekday.equals("Saturday") || weekday.equals("Sunday")) {
            return true;
        }
        return false;
    }

    public static String checkWeekend(String weekday) {
        return (weekday.equals("Saturday") || weekday.equals("Sunday")) ? "Ура, выходной!" : "Надо еще поработать";
    }

    public static void printArray(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if(i != numbers.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        Arrays.sort(numbers);
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= start && numbers[i] <= end) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= start && numbers[i] <= end) {
                result[index] = numbers[i];
                index++;
            }
        }
        return result;
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        if(numbers.length % 2 != 0) {
            int middleIndex = numbers.length / 2;
            return new int[] {numbers[middleIndex]};
        } else {
            int leftMiddleIndex = numbers.length / 2 - 1;
            int rightMiddleIndex = numbers.length / 2;
            return new int[] {numbers[leftMiddleIndex], numbers[rightMiddleIndex]};
        }
        //public static int[] getArrayMiddle(int[] numbers) {
        //    if (numbers == null || numbers.length == 0) {
        //        return new int[0];
        //    }
        //
        //    int middle = numbers.length / 2;
        //
        //    if (numbers.length % 2 == 0) {
        //        return new int[] { numbers[middle - 1], numbers[middle] };
        //    }
        //
        //    return new int[] { numbers[middle] };
        //}
    }

    public static int[] inverseArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        int[] newNumbers = new int[numbers.length];
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            newNumbers[index] = numbers[i];
            index++;
        }
        return newNumbers;

        //public static int[] inverseArray(int[] numbers) {
        //    if (numbers == null || numbers.length == 0) {
        //        return new int[0];
        //    }
        //
        //    int[] result = new int[numbers.length];
        //
        //    for (int i = 0; i < numbers.length; i++) {
        //        result[i] = numbers[numbers.length - 1 - i];
        //    }
        //
        //    return result;
        //}
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] newNumbers = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            newNumbers[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            newNumbers[firstArray.length + i] = secondArray[i];
        }
        for (int i = 0; i < newNumbers.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < newNumbers.length - 1; j++) {
                int temp;
                if(newNumbers[j] > newNumbers[j + 1]) {
                    swapped = true;
                    temp = newNumbers[j];
                    newNumbers[j] = newNumbers[j + 1];
                    newNumbers[j + 1] = temp;
                }
            }
            if(swapped == false) {
                break;
            }
        }
        return newNumbers;
    }

    public static void printArray1(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] getArrayMiddle1(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }
        int middle = numbers.length / 2;
        if(numbers.length % 2 == 0) {
            return Arrays.copyOfRange(numbers, middle - 1, middle + 1);
        }
        return Arrays.copyOfRange(numbers, middle, middle +1);

        //public static int[] getArrayMiddle(int[] numbers) {
        //    if (numbers == null || numbers.length == 0) {
        //        return new int[0];
        //    }
        //
        //    int middle = numbers.length / 2;
        //    int from = middle - (numbers.length % 2 == 0 ? 1 : 0);
        //
        //    return Arrays.copyOfRange(numbers, from, middle + 1);
        //}
    }

    public static int[] mergeAndSort1(int[] firstArray, int[] secondArray) {
        int[] newNumbers = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, newNumbers, 0, firstArray.length);
        System.arraycopy(secondArray, 0, newNumbers, firstArray.length, secondArray.length);
        Arrays.sort(newNumbers);
        return newNumbers;
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder sb = new StringBuilder();
        if(arr != null) {
            for (int num : arr) {
                if (num % 2 != 0) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(num);
                }
            }
        }
        System.out.println(sb.toString());
    }

    public void parseAndPrintNumber(String str) {
        int number = Integer.parseInt(str);
        System.out.println(number / 2);
    }

    public static boolean isGmailOrOutlook(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+@(gmail\\.com|outlook\\.com)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            sb.append(roles[i]).append(":\n");
            for (int j = 0; j < textLines.length; j++) {
                if(textLines[j].substring(0,textLines[j].indexOf(':')).equals(roles[i])) {
                    int numberOfString = j + 1;
                    sb.append(numberOfString).append(") ").append(textLines[j].substring(textLines[j].indexOf(": ") + 2)).append("\n");
                }
            }
            if(i != roles.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ArithmeticCalculations a = new ArithmeticCalculations();
        System.out.println(Arrays.toString(ArithmeticCalculations.mergeAndSort1(new int[]  {1,3,5}, new int[]  {8,20,11})));
//        ArithmeticCalculations.printArray1(new int[] {1,2,3,4,5,6,7});
        ArithmeticCalculations.printOddNumbers(new int[] {1,12,5,6,7,14,27,8});
        a.parseAndPrintNumber("36");
        ArithmeticCalculations.isGmailOrOutlook("123Sobaka@gmail.com");
    }
}
