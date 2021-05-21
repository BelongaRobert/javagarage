package garage;


public class Runner {

	public static void main(String[] args) {
		
		Garage myGarage = new Garage();
        System.out.println("Welcome all to " + myGarage.getGarageName());
		
		Car Vehicle1 = new Car(1,"Toyota", "Avalon", 1997, "Reg");
		Moped Vehicle2 = new Moped(2, "Kymco", "Agility", 2021, 75);
		Motorcycle Vehicle3 = new Motorcycle(3, "Kawasaki", "Bandit", 2012, 1200);
		myGarage.addVehicle(Vehicle1);
		myGarage.addVehicle(Vehicle2);
		myGarage.addVehicle(Vehicle3);
		
		myGarage.GarageList();
	}
			

	}

