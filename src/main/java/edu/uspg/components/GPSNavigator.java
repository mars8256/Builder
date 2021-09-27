package edu.uspg.components;

public class GPSNavigator {
	private String route;
	
	public GPSNavigator() {
		this.route = "Antigua Guatemala, Parque Central";
	}
	
	public GPSNavigator(String manualRoute) {
		this.route = manualRoute;
	}
	
	public String getRoute() {
		return route;
	}
	
	
	
}
