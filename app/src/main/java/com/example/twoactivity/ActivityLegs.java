package com.example.twoactivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;

public class ActivityLegs extends MainActivity {

    final String TAG = "States";

    public void onClickSquat(View view) {
        Intent intent = new Intent(this, SquatActivity.class);
        startActivity(intent);
    }
    public void onClickPress(View view) {
        Intent intent = new Intent(this, PressActivity.class);
        startActivity(intent);
    }
    public void onClickDeadlift(View view) {
        Intent intent = new Intent(this, DeadliftActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Quit");
        builder.setMessage("Are you sure you want to quit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                ActivityLegs.super.onBackPressed();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });
        builder.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
    }
}