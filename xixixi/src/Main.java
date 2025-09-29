import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Generic Car", "Model X", 180, 2022, 2.5);
        Toyota toyota = new Toyota("Toyota", "Supra", 200, 1994, 3.0, "Japan");
        Mercedes mercedes = new Mercedes("Mercedes", "S-Class", 250, 2023, 3.0, "S Class");

        car.ride();
        toyota.ride();
        mercedes.ride();
    }
}
