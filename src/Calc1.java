public class Calc1 {
}
class Main {
    public static String charToHex(String text) {
        StringBuilder result = new StringBuilder();
        char[] array = text.toCharArray();
        for (char c : array) {
            int code = (int) c;
            String s = Integer.toHexString(code).toUpperCase();
            result.append(s).append(" ");
        }
//        System.out.println(result.toString().trim());
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Main.charToHex("Я учусь в KatAcademy");
    }
}

