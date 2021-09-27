package edu.uspg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.uspg.builders.CarBuilder;
import edu.uspg.builders.CarManualBuilder;
import edu.uspg.cars.Car;
import edu.uspg.cars.Manual;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderApplication.class, args);
		
		Director director = new Director();
		
		CarBuilder builder = new CarBuilder();
		
		director.contructSportsCar(builder);
		
		Car car = builder.getResult();
		System.out.println(" Car built:\n" + car.getCarType());
		
		
		CarManualBuilder manualBuilder = new CarManualBuilder();
		
		director.contructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar manual built:\n" + carManual.print());
		
		
	}

}
