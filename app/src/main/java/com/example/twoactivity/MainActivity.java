package com.example.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    Button btnActTwo;
    final String TAG = "States";

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.activity2:
                Intent intent2 = new Intent(this, ActivityTwo.class);
                this.startActivity(intent2);
                break;
            case R.id.activity3:
                Intent intent3 = new Intent(this, ActivityThree.class);
                this.startActivity(intent3);
                break;
            case R.id.activity4:
                Intent intent4 = new Intent(this, ActivityFour.class);
                this.startActivity(intent4);
                break;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG, "MainActivity: onCreate()");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
}}
