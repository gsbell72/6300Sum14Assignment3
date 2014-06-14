package edu.gatech.unitconvertor;

public class WeightActivity {

	public String lbToKilograms(double lbs) {
		double kg = lbs / 2.2046;
		return String.valueOf(kg);
	}

	public String kgToPounds(double kg) {
		double lbs = kg * 2.2046;
		return String.valueOf(lbs);
	}

}
