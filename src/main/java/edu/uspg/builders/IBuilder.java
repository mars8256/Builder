package edu.uspg.builders;

import edu.uspg.cars.CarType;
import edu.uspg.components.Engine;
import edu.uspg.components.GPSNavigator;
import edu.uspg.components.Transmission;
import edu.uspg.components.TripComputer;

public interface IBuilder {

	void setCarType(CarType type);
	void setSeats(int seats);
	void setEngine(Engine engine);
	void setTransmission(Transmission transmission);
	void setTripComputer(TripComputer tripComputer);
	void setGPSNavigator(GPSNavigator gpsNavigator);
	
}
