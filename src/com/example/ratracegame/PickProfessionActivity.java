package com.example.ratracegame;

import java.util.*;
import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

public class PickProfessionActivity extends ActionBarActivity {
	
	static Profession user;
	String jobnames = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pick_profession);
		
		// make a list with all the occupations
		List<Profession> professionList = new ArrayList<Profession>();
		// add string to list
		professionList.add(new TruckDriver());
		professionList.add(new Doctor());
		
		for(int i = 0; i < professionList.size(); i++) {
			jobnames += professionList.get(i).getName() + "\n";
		}
		
		TextView view = (TextView) findViewById(R.id.textView2);
		view.setText(jobnames);
		
		// randomly pick a job
		Random random = new Random();
		int randomInt = random.nextInt(professionList.size());
		user = professionList.get(randomInt);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pick_profession, menu);
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
	
	public void clickGiveMebutton(View view) {				
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("You are a " + user.getName());
		builder.setTitle("You have a job!");
		builder.setPositiveButton(android.R.string.ok,
				new DialogInterface.OnClickListener() { 
	         public void onClick(DialogInterface arg0, int arg1) {  
	             nextActivity();
	        }
	    });
		AlertDialog dialog = builder.create();
		dialog.show();
	}
	
	public void nextActivity() {
		Intent intent = new Intent(this, RatRaceActivity.class);  
        startActivity(intent);
	}
	
	public static Profession getProfession() {
		return user;
	}
}
