package garage;

public class Car extends Vehicle {
    
    protected String fuelType;

    public Car(int ID, String make, String model, int year, String fuelType) {
        super(ID, make, model, year);
        this.fuelType = fuelType;
    }
    
    public String getfuelType() {
        return fuelType;
    }

    public void setfuelType(String fuelType) {
        this.fuelType = fuelType;
    }

	@Override
	public String toString() {
		return "Car [fuelType=" + fuelType + ", ID=" + ID + ", make=" + make + ", model=" + model + ", year=" + year
				+ "]";
	}


}
