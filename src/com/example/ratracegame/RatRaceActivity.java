package com.example.ratracegame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.example.ratracegame.PickProfessionActivity;

public class RatRaceActivity extends ActionBarActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rat_race);
		// create user		
		Profession user = PickProfessionActivity.getProfession();
		
		// check if you can get out
		if(user.getPassiveIncome() > user.getTotalExpenses()) {
			Intent intent = new Intent(this, WinActivity.class);
			startActivity(intent);
		}
		
		// Display user name
		TextView view = (TextView) findViewById(R.id.textView1);
		view.setText(user.getName());
		
		// Display
		String string;
		string = "Goal: Passive Income > Total Expenses" + "\n" +
				"Total Income: " + user.getTotalIncome() + "\n" +
				"Passive Income: " + user.getPassiveIncome() + "\n" +
				"Total Expenses: " + user.getTotalExpenses() + "\n" +
				"Monthly Cash Flow: " + user.getMonthlyCashFlow() + "\n" + "\n" +
				"Balance(money in your bank): " + user.getBalance();
		view = (TextView) findViewById(R.id.textView2);
		view.setText(string);
		
		if(user.getPassiveIncome() > user.getTotalExpenses()) {
			Intent intent = new Intent(this, WinActivity.class);
			startActivity(intent);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rat_race, menu);
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
	
	public void clickBalanceSheet(View view) {
		Intent intent = new Intent(this, BalanceSheetActivity.class);
		startActivity(intent);
	}
	
	public void clickGo(View view) {		
		// make a list with all the occupations
		List<String> cardList = new ArrayList<String>();
		// add string to list
		cardList.add("chance");
		cardList.add("chance");
		cardList.add("chance");
		cardList.add("downsized");
		cardList.add("paycheck");
		cardList.add("paycheck");
		cardList.add("paycheck");
		for(int i = 0; i < 10; i++)
			cardList.add("opportunity");
		
		Random random = new Random();
		int randomInt = random.nextInt(cardList.size());
		String card = cardList.get(randomInt);
		findType(card);
	}
	
	void findType(String card) {
		if(card == "paycheck") {
			Intent intent = new Intent(this, PaycheckActivity.class);
			startActivity(intent);
		}
		else if(card=="downsized") {
			Intent intent = new Intent(this, DownsizedActivity.class);
			startActivity(intent);
		}
		if(card == "chance") {
			Intent intent = new Intent(this, ChanceActivity.class);
			startActivity(intent);
		}
		if(card == "opportunity") {
			Intent intent = new Intent(this, OpportunityActivity.class);
			startActivity(intent);
		}
	}
}
