package com.example.tipcalculatorapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class TipCalculator extends Activity {
	private EditText etTotalAmount;
	private EditText etTip;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
		etTotalAmount = (EditText) findViewById(R.id.etTotalAmount);
	}

	public void calculateTip(View v) {
		int tipPercent = Integer.parseInt(v.getTag().toString());
		int totalAmount = Integer.parseInt(etTotalAmount.getText().toString());
		
		etTip.setText("" + (totalAmount*tipPercent)/100);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calculator, menu);
		return true;
	}

}
