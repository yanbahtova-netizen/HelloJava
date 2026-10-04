public class Cycle1 {
    public  static boolean determineAdult(int age) {
        if(age<0) {
            System.out.println("Ошибка! Введите правильный возраст.");
            return false;
        }
        return age>=18;
    }

    public static void main(String[] args) {
        determineAdult(10);
    }
}
