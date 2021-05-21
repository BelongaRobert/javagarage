package garage;

public class Moped extends Vehicle{
    protected int maxMph;

    public Moped( int ID, String make, String model, int year, int maxMph) {
        super(ID, make, model, year);
        this.maxMph = maxMph;
    }
    
    public int getmaxMph() {
        return maxMph;
    }

    public void setmaxMph(int maxMph) {
        this.maxMph = maxMph;
    }
}