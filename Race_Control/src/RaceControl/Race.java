package RaceControl;

import java.util.*;

public class Race {
	private String RaceName;
	private Integer RaceDuration;
	private ArrayList<Garage> RaceGarages;
	private Integer[] RacePodium;
	
	public Race(String RaceName, Integer RaceDuration, ArrayList<Garage> RaceGarages) {
		this.RaceName = RaceName;
		this.RaceDuration= RaceDuration;
		this.RaceGarages = RaceGarages;
		
	}
		
	public Integer[] getRacePodium() {
		return RacePodium;
	}
	
	public void setRacePodium(Integer[] RacePodium) {
		this.RacePodium = RacePodium;
	}
	public String getRaceName() {
		return RaceName;
	}
	
	public void setRaceName(String RaceName) {
		this.RaceName = RaceName;
	}
	
	public Integer getRaceDuration() {
		return RaceDuration;
	}
	
	public void setRaceDuration(Integer RaceDuration) {
		this.RaceDuration = RaceDuration;
	}
	
	public ArrayList<Garage> getRaceGarages(){
		return RaceGarages;
	}
}
