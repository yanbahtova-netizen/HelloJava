package javaCore3;

public class Zalupa {
    static class Car implements AutoCloseable {
        public void close() {
            System.out.println("Машина закрывается...");
        }
        void drive() {
            System.out.println("Машина поехала.");
        }
        public static void main(String[] args) {
            try(Car car = new Car()) {
                car.drive();
            } catch (RuntimeException e) {

            }
        }
    }
}
