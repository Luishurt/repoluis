package RaceControl;

import java.util.ArrayList;


public class Garage {
	private String GarageName;
	private ArrayList<Car> GarageCars;
	private String GarageSticker;
	
	public Garage(String GarageName, String GarageSticker) {
		this.GarageName = GarageName;
		this.GarageSticker = GarageSticker;

	}
	
	
	public String getGarageName() {
		return GarageName;
	}
	
	public void setGarageName(String GarageName) {
		this.GarageName = GarageName;
	}
	
	public ArrayList<Car> getGarageCars(){
		return GarageCars;
	}
	
	public void setGarageCars(ArrayList<Car> GarageCar) {
		this.GarageCars = GarageCar;
	}
	
	public String getGarageSticker() {
		return GarageSticker;
	}

	}
	



