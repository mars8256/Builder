package edu.uspg.cars;

import edu.uspg.components.Engine;
import edu.uspg.components.GPSNavigator;
import edu.uspg.components.Transmission;
import edu.uspg.components.TripComputer;

public class Car {
	private  CarType carType = null;
	private  int seats = 0;
	private  Engine engine = null;
	private  Transmission transmission = null;
	private  TripComputer tripComputer = null;
	private  GPSNavigator gpsNavigator = null;
	private double fuel = 0;
	
	public Car(CarType carType, int seats, Engine engine, Transmission transmission,
			TripComputer tripComputer, GPSNavigator gpsNavigator) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		if(this.tripComputer != null) {
			this.tripComputer.setCar(this);
		}
		this.gpsNavigator = gpsNavigator;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public TripComputer getTripComputer() {
		return tripComputer;
	}

	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}

	public void setGpsNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	
	
	
}


