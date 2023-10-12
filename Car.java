public class Car {
    private int id;
    private String make;
    private String model;
    private int yearOfManufacture;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(int id, String make, String model, int yearOfManufacture, String color, double price, String registrationNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}

public class CarArrayExample {
    public static void main(String[] args) {
        
        Car[] cars = new Car[3];

        for (Car car : cars) {
            System.out.println("Car ID: " + car.getId());
            System.out.println("Make: " + car.getMake());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year of Manufacture: " + car.getYearOfManufacture());
            System.out.println("Color: " + car.getColor());
            System.out.println("Price: $" + car.getPrice());
            System.out.println("Registration Number: " + car.getRegistrationNumber());
            System.out.println();
        }
    }
}

