package com.example.twoactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.activity2:
                Intent intent2 = new Intent(this, ActivityWeight.class);
                this.startActivity(intent2);
                break;
            case R.id.activity3:
                Intent intent3 = new Intent(this, SearchActivity.class);
                this.startActivity(intent3);
                break;
            case R.id.activity4:
                Intent intent4 = new Intent(this, WorkoutActivity.class);
                this.startActivity(intent4);
                break;
        }
        return super.onOptionsItemSelected(item);

    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityWeight.class);
        startActivity(intent);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(MainActivity.this, WorkoutActivity.class);
        startActivity(intent);
    }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
