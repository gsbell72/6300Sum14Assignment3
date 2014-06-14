package edu.gatech.unitconvertor;

public class TemperatureActivity {

	public String fToCelcius(double f) {
		double c = f - 32 / 1.800;
		return String.valueOf(c);
	}

	public String ctoFernheit(double c) {
		double f = c * 1.800 + 32;
		return String.valueOf(f);
	}

}
