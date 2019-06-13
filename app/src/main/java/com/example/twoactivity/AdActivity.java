package com.example.twoactivity;

import android.os.Bundle;
import android.view.View;

public class AdActivity extends MainActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);
    }
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.button6:
//                SQLiteDatabase myDB = openOrCreateDatabase("my.db", MODE_PRIVATE, null);
//                myDB.execSQL(
//                        "CREATE TABLE IF NOT EXISTS workout (part VARCHAR(200), exercise VARCHAR(200), weight INT)");
//                ContentValues row1 = new ContentValues();
//                row1.put("part", editText6.getText().toString());
//                row1.put("exercise", editText7.getText().toString());
//                row1.put("weight", editText8.getText().toString());
//                myDB.insert("workout", null, row1);
//                editText6.setText("");
//                editText7.setText("");
//                editText8.setText("");
//                break;
//            default:
//                break;
//        }
//    }
}