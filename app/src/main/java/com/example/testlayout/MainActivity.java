package com.example.testlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import net.tsz.afinal.FinalActivity;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//这是今天的提交d 
		//这个是今天的 分支 branch
		//这是分支 taoran的改动 8.82
		//分支taoran 再次改动 这是develop 上的
		//taoran修改 25555  
		//dsaasfdasassf
		//dsaasfdasassf
		FinalActivity fa = new FinalActivity();
		FinalActivity faa = new FinalActivity();
		TextView viewById = (TextView) findViewById(R.id.oktextview);
		TextView tv = (TextView) findViewById(R.id.oktextview);
		Gson g = new Gson();

		// TODO: 15/9/5 this is MainActivity todo flag
	}

	/*@Override
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
*/
	}
