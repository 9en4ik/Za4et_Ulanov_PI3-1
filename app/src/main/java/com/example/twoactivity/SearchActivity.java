package com.example.twoactivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SearchActivity extends MainActivity {

    EditText search_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        search_box = (EditText) findViewById(R.id.search);
    }

    public void onClickSearch(View view) {

        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        String term = search_box.getText().toString();
        intent.putExtra(SearchManager.QUERY, term + " calories" );
        startActivity(intent);
    }
}

