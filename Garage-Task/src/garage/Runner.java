package garage;



public class Runner {



	public static void main(String[] args) {
		
		Garage GarageList = new Garage();
        System.out.println("Welcome all to " + GarageList.getGarageName());
		
        Car Vehicle1 = new Car(1,"Toyota", "Avalon", 1997, "Reg");
		Moped Vehicle2 = new Moped(2, "Kymco", "Agility", 2021, 75);
		Motorcycle Vehicle3 = new Motorcycle(3, "Kawasaki", "Bandit", 2012, 1200);
		GarageList.addVehicle(Vehicle1);
		GarageList.addVehicle(Vehicle2);
		GarageList.addVehicle(Vehicle3);
		
		
		
		System.out.println(GarageList);
	}
			

	}

