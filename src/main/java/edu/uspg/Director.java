package edu.uspg;

import edu.uspg.builders.IBuilder;
import edu.uspg.cars.CarType;
import edu.uspg.components.Engine;
import edu.uspg.components.GPSNavigator;
import edu.uspg.components.Transmission;
import edu.uspg.components.TripComputer;

public class Director {

	
	public void contructSportsCar(IBuilder builder) {
		builder.setCarType(CarType.SPORTS_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(3.0,0 ));
		builder.setTransmission(Transmission.SEMI_AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());

	}
	
	public void constructCityCar(IBuilder builder) {
		builder.setCarType(CarType.CITY_CAR);
		builder.setSeats(4);
		builder.setEngine(new Engine(1.2,0 ));
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}
	
	public void constructSUV(IBuilder builder) {
		builder.setCarType(CarType.SUV );
		builder.setSeats(5);
		builder.setEngine(new Engine(2.7,0 ));
		builder.setTransmission(Transmission.MANUAL);
		builder.setGPSNavigator(new GPSNavigator());
	}
	
}
