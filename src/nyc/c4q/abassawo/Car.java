package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/24/15.
*/

public class Car {

    String make;
    String model;
    int year;
    double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public double getPrice() {
        return this.price;
    }
}
