public class Human {
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    public void sayHello() {
        System.out.println("Привет, меня зовут "+name+", мне "+age+" лет.");
    }
}
class Test{
    public static void main(String[] args) {
        Human human = new Human("Marina", 33);
        human.sayHello();
    }
}