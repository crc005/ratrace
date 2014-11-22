package com.example.ratracegame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ChanceActivity extends Activity {

	String type, type1, type2, type3, type4, type5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chance);
		
		type = typeChance();		
		// edit font
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        TextView tv = (TextView) findViewById(R.id.textView1);
        tv.setText(type);
        tv.setTypeface(tf);
		// get user
		Profession user = PickProfessionActivity.getProfession();
		getExpense(user, type);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chance, menu);
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
	
	String typeChance() {
		type1 = "Go to summer camp.";
		type2 = "Buy new party clothes.";
		type3 = "Buy doll.";
		type4 = "Buy new furniture.";
		type5 = "Birthday Party.";
		
		List<String> chanceList = new ArrayList<String>();
		chanceList.add(type1);
		chanceList.add(type2);
		chanceList.add(type3);
		chanceList.add(type4);
		chanceList.add(type5);
		
		Random random = new Random();
		int randomInt = random.nextInt(chanceList.size());
		return chanceList.get(randomInt);		
	}
	
	void getExpense(Profession user, String type) {
		TextView tv = (TextView) findViewById(R.id.textView2);

		if(type == type1) {
			int temp = user.getTotalExpenses();
			user.addOther_expenses(110);
			tv.setText("Increases expense by 110." + "\n" +
					"Initial Total Expense: $" + String.valueOf(temp) + "\n" +
					"New Total Expense: $" + String.valueOf(user.getTotalExpenses()));
			user.getBalance();
		}
		else if(type == type2) {
			int temp = user.getTotalExpenses();
			user.addOther_expenses(30);
			tv.setText("Increases expense by 30." + "\n" +
					"Initial Total Expense: $" + String.valueOf(temp) + "\n" +
					"New Total Expense: $" + String.valueOf(user.getTotalExpenses()));
			user.getBalance();
		}
		else if(type == type3) {
			int temp = user.getBalance();
			user.setBalance(-200);
			tv.setText("Pay 200."+ "\n" +
					"Initial Balance: $" + String.valueOf(temp) + "\n" +
					"New Balance: $" + String.valueOf(user.getBalance()));
		}
		else if(type == type4) {
			int temp = user.getBalance();
			user.setBalance(-40);
			tv.setText("Pay 40."+ "\n" +
					"Initial Balance: $" + String.valueOf(temp) + "\n" +
					"New Balance: $" + String.valueOf(user.getBalance()));
		}
		else if(type == type5) {
			int temp = user.getBalance();
			user.setBalance(-200);
			tv.setText("Pay 200."+ "\n" +
					"Initial Balance: $" + String.valueOf(temp) + "\n" +
					"New Balance: $" + String.valueOf(user.getBalance()));
		}
	}
	
	public void clickBack(View view) {
		Intent intent = new Intent(this, RatRaceActivity.class);
		startActivity(intent);
	}
}
