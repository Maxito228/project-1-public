public class Car {
    String name;
    String model;
    int maxSpeed;
    int year;
    double volume;

    public Car() {
        this.name = "Unknown";
        this.model = "Unknown";
        this.maxSpeed = 0;
        this.year = 0;
        this.volume = 0.0;
    }

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public void ride() {
        System.out.println("Car Details: ");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Year: " + year);
        System.out.println("Engine Volume: " + volume + " liters");
        System.out.println("Car is riding...");
        System.out.println(" ");
    }
}
