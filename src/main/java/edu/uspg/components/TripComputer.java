package edu.uspg.components;

import edu.uspg.cars.Car;

public class TripComputer {
	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void showFuelLevel() {
		System.out.println("Fuel level: " + car.getFuel());
	}
	
	public void showStatus() {
		if(this.car.getEngine().isStarted()) {
			System.out.println("Cart is started");
		} else {
			System.out.println("Car isn't started");
		}
	}
	
}
