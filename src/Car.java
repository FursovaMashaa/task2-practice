import java.util.Objects;

class Car implements Comparable<Car> {
    private final String vin;
    private String model;
    private String manufacturer;
    private int year;
    private int mileage;
    private double price;

    public Car(String vin, String model, String manufacturer, int year, int mileage, double price) {
        this.vin = vin;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }
    public String getVin() {
        return vin;
    }
    public String getModel() {
        return model;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getYear() {
        return year;
    }
    public int getMileage() {
        return mileage;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return vin.equals(car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(other.year, this.year);
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d) VIN:%s, %d km, $%.2f",
                manufacturer, model, year, vin, mileage, price);
    }
}