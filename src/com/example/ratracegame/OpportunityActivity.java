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

public class OpportunityActivity extends Activity {

	String type, type1, type2, type3, type4, type5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_opportunity);
		
		type = typeOpportunity();		
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
		getMenuInflater().inflate(R.menu.opportunity, menu);
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
	
	String typeOpportunity() {
		type1 = "You Find A Great Deal!";
		type2 = "House For Sale - 3Br/2Ba";
		//type3 = "Buy doll.";
		//type4 = "Buy new furniture.";
		//type5 = "Birthday Party.";
		
		List<String> oppList = new ArrayList<String>();
		oppList.add(type1);
		oppList.add(type2);
		//oppList.add(type3);
		//oppList.add(type4);
		//oppList.add(type5);
		
		Random random = new Random();
		int randomInt = random.nextInt(oppList.size());
		return oppList.get(randomInt);
	}
	
	void getExpense(Profession user, String type) {
		TextView tv = (TextView) findViewById(R.id.textView2);

		if(type == type1) {
			tv.setText("Company bought a 3/2 house." + "\n" +
					"Cost: $45,000	Mortgage: $43,000" + "\n" +
					"DownPay:$2,000	Cash Flow: $1000");
		}
		else if(type == type2) {
			tv.setText("Company bought a 3/2 house." + "\n" +
					"Cost: $45,000	Mortgage: $43,000" + "\n" +
					"DownPay:$2,000	Cash Flow: $1000");
		}
		else if(type == type3) {
			
		}
		else if(type == type4) {
			
		}
		else if(type == type5) {
			
		}
	}
	
	public void clickBuy(View view) {
		
	}
	
	public void clickBack(View view) {
		Intent intent = new Intent(this, RatRaceActivity.class);
		startActivity(intent);
	}
}
