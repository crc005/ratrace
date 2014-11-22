package com.example.ratracegame;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.example.ratracegame.PickProfessionActivity;

public class PaycheckActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_paycheck);
		
		// edit font
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setTypeface(tf);		
		// get user
		Profession user = PickProfessionActivity.getProfession();
		// add to balance
		int temp = user.getBalance();
		user.setBalance(user.getMonthlyCashFlow());
		// show monthly cash flow
		TextView view = (TextView) findViewById(R.id.textView1);
		view.setText("$" + String.valueOf(user.getMonthlyCashFlow()) + "\n" +
				"Initial Balance: $" + String.valueOf(temp) + "\n" +
				"New Balance: $" + String.valueOf(user.getBalance()));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.paycheck, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void clickBack(View view) {
		Intent intent = new Intent(this, RatRaceActivity.class);
		startActivity(intent);
	}
}
