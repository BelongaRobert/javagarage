package garage;

public abstract class Vehicle {
    protected int ID;
	protected String make;
    protected String model;
    protected int year;
    
    public Vehicle(int ID, String make, String model, int year) {
        this.ID = ID;
    	this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getID() {
    	return ID;
    }
    
    public void setID(int ID) {
    	this.ID = ID;
    }
    
    public String getMake(){
        return make;

    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

}