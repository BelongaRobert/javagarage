public class Motorcycle extends Vehicle {

    protected int engineSize;

    public Motorcycle(String make, String model, int year, int engineSize) {
        super(make, model, year);
        this.engineSize = engineSize;    
    }

    public int getengineSize(){
        return engineSize;
    }
    
    public void setengineSize(int engineSize) {
        this.engineSize = engineSize;
    }
}