public class Car extends Vehicle {
    
    protected String fuelType;

    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year);
        this.fuelType = fuelType;
    }
    
    public String getfuelType() {
        return fuelType;
    }

    public void setfuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}