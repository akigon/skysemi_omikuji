package com.skysemi.android.omikuji;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button = (Button)findViewById(R.id.omikuji_button);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				TextView text = (TextView)findViewById(R.id.omikuji_result);
				text.setTextColor(Color.BLACK);

				switch (new Random().nextInt(9)) {
				case 0:
					text.setText(getString(R.string.omikuji_result_0));
					text.setTextColor(Color.RED);
					break;
				case 1:
				case 2:
					text.setText(getString(R.string.omikuji_result_1));
					break;
				case 3:
				case 4:
				case 5:
					text.setText(getString(R.string.omikuji_result_2));
					break;
				case 6:
				case 7:
					text.setText(getString(R.string.omikuji_result_3));
					break;
				case 8:
					text.setText(getString(R.string.omikuji_result_4));
					break;

				default:
					break;
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
