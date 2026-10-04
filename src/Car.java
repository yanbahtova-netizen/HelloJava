public class Car {
    private String modelName;
    private Float fuelQuantity;
    private Driver driver = null;

    public Car(String modelName, Float fuelQuantity) {
        this.modelName = modelName;
        this.fuelQuantity = fuelQuantity;
    }

    public void drive(Driver driver) {
        this.driver = driver;
        System.out.println("Ну что "+driver.getDriverName()+", "+modelName+" отвезет тебя куда угодно");
    }

    public Float getFuelQuantity() {
        return fuelQuantity;
    }
}

class Driver {
    private String driverName;
    private Car car;

    public Driver(String driverName, Car car) {
        this.driverName = driverName;
        this.car = car;
    }

    public void driveByCar() {
        if(car.getFuelQuantity() == 0) {
            System.out.println("Сегодня я никуда не поеду");
            return;
        } else if (car.getFuelQuantity() < 10) {
            System.out.println("Ох, доехать бы до заправки");
            car.drive(this);
        } else if (car.getFuelQuantity() > 10) {
            System.out.println("Вроде права не забыл, ну поехали");
            car.drive(this);
        }
    }

    public String getDriverName() {
        return driverName;
    }
}
class Test1 {
    public static void main(String[] args) {
        Car car = new Car("BMV", 40.5F);
        car.drive(new Driver("Ivan", car));
        Driver driver = new Driver("Peta", car);
        driver.driveByCar();
    }
}