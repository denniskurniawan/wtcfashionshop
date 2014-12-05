package com.dennis.wtcfashionshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    
    public void openHammer(View w){
		Intent j = new Intent(getApplicationContext(),HammerActivity.class);
		startActivity(j);
	}
    
    public void openWrangler(View x){
		Intent k = new Intent(getApplicationContext(),WranglerActivity.class);
		startActivity(k);
	}
    
    public void openTanjabtim(View y){
		Intent l = new Intent(getApplicationContext(),TanjabtimActivity.class);
		startActivity(l);
	}
}
