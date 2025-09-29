public class Mercedes extends Car {
    String classType;

    public Mercedes() {
        super();
        this.classType = "Unknown";
    }

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public void ride() {
        System.out.println("Mercedes Details: ");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Year: " + year);
        System.out.println("Engine Volume: " + volume + " liters");
        System.out.println("Class Type: " + classType);
        System.out.println("Mercedes is riding... luxury");
        System.out.println(" ");
    }
}
