package garage;

public class Motorcycle extends Vehicle {

    protected int engineSize;

    public Motorcycle(int ID, String make, String model, int year, int engineSize) {
        super(ID, make, model, year);
        this.engineSize = engineSize;    
    }

    public int getengineSize(){
        return engineSize;
    }
    
    public void setengineSize(int engineSize) {
        this.engineSize = engineSize;
    }
}
