public class Toyota extends Car {
    String manufacturer;

    public Toyota() {
        super();
        this.manufacturer = "Unknown";
    }


    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    public void ride() {
        System.out.println("Toyota Details: ");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Year: " + year);
        System.out.println("Engine Volume: " + volume + " liters");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Toyota is riding... vroom");
        System.out.println(" ");
    }
}
