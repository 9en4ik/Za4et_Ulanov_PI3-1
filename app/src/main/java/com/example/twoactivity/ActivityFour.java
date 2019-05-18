package com.example.twoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityFour extends MainActivity {

    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        Log.d(TAG, "ActivityFour: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityFour: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityFour: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityFour: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityFour: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityFour: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityFour: onDestroy()");
    }
}