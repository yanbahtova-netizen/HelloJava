public class Kod {
    public static void main(String[] args) {
        String word ="Код";

        String text = "Код - код - код — и день пролетел, Код - код - код — и ночь не заметил, Код - код - код — багов стало чуть меньше, Код - код - код — и опять всё не так, Код - код - код… но без него скучно.";
//Тут вызываем метод quantity и возвращаем в консоль результат работы метода quantity
        System.out.println("Слово «" + word + "» встречается - " + quantity (text, word) + " раз");
    }

    public static int quantity(String text, String word) {
        String lowerWord = word.toLowerCase();
        String lowerText = text.toLowerCase();
        String[] array = lowerText.split("[^а-я]+");
        int count = 0;
        for (String w:array) {
            if(w.equals(lowerWord)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
