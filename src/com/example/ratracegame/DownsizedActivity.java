package com.example.ratracegame;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DownsizedActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_downsized);
		
		// edit font
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setTypeface(tf);		
		// get user
		Profession user = PickProfessionActivity.getProfession();
		// add to balance
		int temp = user.getBalance();
		user.setBalance(-user.getTotalExpenses());
		// show monthly cash flow
		TextView view = (TextView) findViewById(R.id.textView1);
		view.setText("You\'ve temporarily lost your job!" + "\n" + 
				"Pay your total expense: $" + String.valueOf(user.getTotalExpenses()) + "\n" +
				"Inital Balance: $" + String.valueOf(temp) + "\n" +
				"New Balance: $" + String.valueOf(user.getBalance()));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.downsized, menu);
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
