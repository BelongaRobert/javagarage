package garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private String GarageName;

	public Garage() {
		super();
		this.GarageName = "Robert's Garage";
	}
	List<Vehicle> GarageList = new ArrayList<>();
	
	
	public Garage(List<Vehicle> GarageList) {
		this.GarageList = GarageList;
		
	}
	

	public void addVehicle(Vehicle bought) {
		this.GarageList.add(bought);
	}
	
	public void removeVehicle(Vehicle sold) {
		this.GarageList.remove(sold);
	}


	public void GarageList() {
		// TODO Auto-generated method stub
		
	}


	public String getGarageName() {
		return GarageName;
	}


	public void setGarageName(String garageName) {
		GarageName = garageName;
	}



}
