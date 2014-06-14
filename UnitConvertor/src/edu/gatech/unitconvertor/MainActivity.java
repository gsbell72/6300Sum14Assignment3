package edu.gatech.unitconvertor;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

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
	
	public void handleClick(View view) {
		boolean checked = ((RadioButton) view).isChecked();
		
		EditText txt = (EditText) findViewById(R.id.Text1);
		double distance = Double.parseDouble(txt.getText().toString());
		
		switch(view.getID()) {
		case R.id.radio0:
			if(checked)
				txt.setText(kmToMiles(distance));
			break;
		case R.id.radio1:
			if(checked)
				txt.setText(milesToKm(distance));
			break;
		}
	}
}
