package com.example.twoactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WorkoutActivity extends MainActivity {

    public void onClickAdd(View view) {
        Intent intent = new Intent(this, AdActivity.class);
        startActivity(intent);
    }
    public void onClickLegs(View view) {
        Intent intent = new Intent(this, ActivityLegs.class);
        startActivity(intent);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

    }
}
