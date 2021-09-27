package edu.uspg.components;

public class Engine {
	private double volume = 0;
	private double mileage;
	private boolean started;
	
	
	public Engine(double volume, double mileage) {
		this.volume = volume;
		this.mileage = mileage;
	}
	
	public void on() {
		started = true;
	}
	
	public void off() {
		started = false;
	}
	
	public boolean isStarted() {
		return started;
	}
	
	public void go(double mileage) {
		if(started) {
			this.mileage += mileage;
		} else {
			System.err.println("no puedo avanzar, necesitas encender primero!");
		}
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	
	
}

