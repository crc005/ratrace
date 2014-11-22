package com.example.ratracegame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.example.ratracegame.PickProfessionActivity;

public class BalanceSheetActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_balance_sheet);
		
		Profession user = PickProfessionActivity.getProfession();
		String string;
		string = "Salary:	" + user.getSalary() + "\n" +
				"Interest:	" + user.getInterest() + "\n" +
				"Dividends:	" + user.getDividends() + "\n" +
				"Real Estate/Businesses: " + user.getRetail_income();
		TextView view = (TextView) findViewById(R.id.textView3);
		view.setText(string);
		
		string = "Taxes:	" + user.getTaxes() + "\n" +
				"Home Mortgage:	" + user.getRentpay() + "\n" +
				"School loan:	" + user.getSchoolloanpay() + "\n" +
				"Car Payment:	" + user.getCarpay() + "\n" +
				"Credit Card Payment:	" + user.getCreditcardpay() + "\n" +
				"Retail Payment:	" + user.getRetailpayment() + "\n" +
				"Other Expenses:	" + user.getOther_expenses();
		view = (TextView) findViewById(R.id.textView5);
		view.setText(string);
		
		string = "Savings:	" + user.getSavings();
		view = (TextView) findViewById(R.id.textView7);
		view.setText(string);
		
		string = "Mortgage:	" + user.getMortgage() + "\n" +
				"School Loan:	" + user.getSchoolloan() + "\n" +
				"Car Loan:	" + user.getCarloan() + "\n" +
				"Credit Card:	" + user.getCreditcard() + "\n" +
				"Retail Debt:	" + user.getRetaildebt();
		view = (TextView) findViewById(R.id.textView9);
		view.setText(string);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.balance_sheet, menu);
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
}
