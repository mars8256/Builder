package edu.uspg.builders;

import edu.uspg.cars.CarType;
import edu.uspg.cars.Manual;
import edu.uspg.components.Engine;
import edu.uspg.components.GPSNavigator;
import edu.uspg.components.Transmission;
import edu.uspg.components.TripComputer;

public class CarManualBuilder implements IBuilder {

	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;
	
	
	@Override
	public void setCarType(CarType type) {
		this.type = type;
		
	}
	@Override
	public void setSeats(int seats) {
		this.seats = seats;
		
	}
	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
		
	}
	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
		
	}
	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
		
	}
	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
		
	}
	
	public Manual getResult() {
		return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
	
	
}
