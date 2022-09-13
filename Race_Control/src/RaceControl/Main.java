package RaceControl;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Se crean los Garages
		
				
		Garage Germain = new Garage("Germain Racing", "Germain");
		Garage Hendrick = new Garage("Hendrick Motorsports", "Hendrick");
		Garage Penske = new Garage("Penske Racing", "Penske");
		Garage RedBull = new Garage("Red Bull Racing Team", "RedBull");
		Garage NEMCO = new Garage("NEMCO Motorsports", "NEMCO");

				
		// se crean los Coches
		
		Car Ford = new Car("Ford","Fusion");
		Car Ford2 = new Car("Ford", "Mustang GT VI");
		Car Chevrolet = new Car("Chevrolet", "Impala SS");
		Car Chevrolet2 = new Car("Chevrolet", "Camaro SS");
		Car Toyota = new Car("Toyota", "Camry");
		Car Toyota2 = new Car("Toyota", "Supra MKV");
		Car Dodge = new Car("Dodge", "Charger");
		
		//Se asignan los Coches a los Garages
		
		ArrayList<Car> CarsGermain = new ArrayList<>();
		CarsGermain.add(Dodge);
		CarsGermain.add(Chevrolet);
		CarsGermain.add(Toyota2);
		Germain.setGarageCars(CarsGermain);
			
		ArrayList<Car> CarsHendrick = new ArrayList<>();
		CarsHendrick.add(Chevrolet);
		CarsHendrick.add(Ford);
		CarsHendrick.add(Dodge);
		Hendrick.setGarageCars(CarsHendrick);
		
		ArrayList<Car> CarsPenske = new ArrayList<>();
		CarsPenske.add(Chevrolet2);
		CarsPenske.add(Chevrolet);
		CarsPenske.add(Ford2);
		Penske.setGarageCars(CarsPenske);
		
		ArrayList<Car> CarsRedBull = new ArrayList<>();
		CarsRedBull.add(Ford);
		CarsRedBull.add(Ford2);
		CarsRedBull.add(Chevrolet2);
		CarsRedBull.add(Dodge);
		RedBull.setGarageCars(CarsRedBull);
		
		ArrayList<Car> CarsNEMCO = new ArrayList<>();
		CarsNEMCO.add(Toyota);
		CarsNEMCO.add(Dodge);
		CarsNEMCO.add(Chevrolet2);
		NEMCO.setGarageCars(CarsNEMCO);
		
		// Se agregan los Stickers a los coches
				
		
		
	}
}
