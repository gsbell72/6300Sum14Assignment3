package edu.gatech.unitconvertor;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public String milesToKm(double miles) {
		double km = miles * 1.609;
		return String.valueOf(km);
	}

	public String kmToMiles(double km) {
		double miles = km / 1.609;
		return String.valueOf(miles);
	}

	public String fToCelcius(double f) {
		double c = f - 32 / 1.800;
		return String.valueOf(c);
	}

	public String cToFahrenheit(double c) {
		double f = c * 1.800 + 32;
		return String.valueOf(f);
	}

	public String lbToKilograms(double lbs) {
		double kg = lbs / 2.2046;
		return String.valueOf(kg);
	}

	public String kgToPounds(double kg) {
		double lbs = kg * 2.2046;
		return String.valueOf(lbs);
	}

	public void handleClick(View view) {
		boolean checked = ((RadioButton) view).isChecked();
		
		EditText txt = (EditText) findViewById(R.id.Text1);
		double distance = Double.parseDouble(txt.getText().toString());
		
		switch(view.getId()) {
		case R.id.radio0:
			if(checked)
				txt.setText(kmToMiles(distance));
			break;
		case R.id.radio1:
			if(checked)
				txt.setText(milesToKm(distance));
			break;
		case R.id.radio2:
			if(checked)
				txt.setText(fToCelcius(distance));
			break;
		case R.id.radio3:
			if(checked)
				txt.setText(cToFahrenheit(distance));
			break;
		case R.id.radio4:
			if(checked)
				txt.setText(lbToKilograms(distance));
			break;
		case R.id.radio5:
			if(checked)
				txt.setText(kgToPounds(distance));
			break;
		}
	}
}
