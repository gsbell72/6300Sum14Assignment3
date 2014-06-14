package edu.gatech.unitconvertor;

public class DistanceActivity {

	public String milesToKm(double miles) {
		double km = miles * 1.609;
		return String.valueOf(km);
	}

	public String kmToMiles(double km) {
		double miles = km / 1.609;
		return String.valueOf(miles);
	}
	
}
