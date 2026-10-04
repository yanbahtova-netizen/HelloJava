import java.util.Scanner;

public class Сonsole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Как Вас зовут?");
        String name = scan.nextLine();
        System.out.println("Здравствуйте, "+name+"!");
    }
}
