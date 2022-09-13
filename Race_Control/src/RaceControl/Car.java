package RaceControl;

public class Car {
	private String CarBrand;
	private String CarModel;
	private String CarGarage;
	static final Integer CarMaxSpeed = 250;
	private Integer CarSpeed;
	private final Integer CarMinSpeed = 0;
	
		public Car(String CarBrand, String CarModel){
			this.CarBrand = CarBrand;
			this.CarModel = CarModel;
			
		}
		
		public String getCarBrand() {
			return CarBrand;
		}
		
		public void setCarBrand(String CarBrand) {
			this.CarBrand = CarBrand;
		}	
		
		public String getCarModel() {
			return CarModel;
		}
		
		public void setCarModel(String CarModel) {
			this.CarModel= CarModel;
		}
		
		public String getCarGarage() {
			return CarGarage;
		}
		
		public void setCarGarage(String CarGarage) {
			this.CarGarage= CarGarage;
		}
		
		public void setGarageCar(String CarBrand, String CarGarage) {
			this.CarBrand = CarBrand;
			this.CarGarage = CarGarage;
		}
		
}
