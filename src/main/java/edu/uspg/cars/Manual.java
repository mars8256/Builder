package edu.uspg.cars;

import edu.uspg.components.Engine;
import edu.uspg.components.GPSNavigator;
import edu.uspg.components.Transmission;
import edu.uspg.components.TripComputer;

public class Manual {

	private  CarType carType = null;
	private  int seats = 0;
	private  Engine engine = null;
	private  Transmission transmission = null;
	private  TripComputer tripComputer = null;
	private  GPSNavigator gpsNavigator = null;
	
	public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
			TripComputer tripComputer, GPSNavigator gpsNavigator) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.gpsNavigator = gpsNavigator;
	}
	
	public String print() {
		String info = "";
		info += " Type of car: " + carType + "\n";
		info += "Count of seats: " + seats + "\n";
		info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
		info += "Transmission: " + transmission + "\n";
		if (this.tripComputer != null) {
			info += "Trip Computer: Functional " + "\n";
		} else {
			info += "Trip Computer: N/A " + "\n";
		}
		if (this.gpsNavigator != null) {
			info += "GPS Navigator: Functional " + "\n";
		}else {
			info += "GPS Navigator: N/A " + "\n";
		}
		return info;
	}
	
}
