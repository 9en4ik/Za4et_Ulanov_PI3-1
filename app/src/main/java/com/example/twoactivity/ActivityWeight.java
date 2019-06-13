package com.example.twoactivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityWeight extends MainActivity implements View.OnClickListener {

    EditText editText, editText2, editText3, editText4;
    Button btnSave, btnLoad;

    SharedPreferences sPref;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);

        btnSave = (Button) findViewById(R.id.button4);
        btnSave.setOnClickListener(this);

        btnLoad = (Button) findViewById(R.id.button5);
        btnLoad.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button4:
                saveText();
                editText.setText("");
                editText2.setText("");
                break;
            case R.id.button5:
                loadText();
                break;
            default:
                break;
        }
    }

    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(editText2.getText().toString(), editText.getText().toString());
        ed.commit();
        Toast.makeText(this, "Value is saved", Toast.LENGTH_SHORT).show();
    }

    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(editText3.getText().toString(), "No data presented");
        editText4.setText(savedText);
        Toast.makeText(this, "Value is loaded", Toast.LENGTH_SHORT).show();
    }
}
