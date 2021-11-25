package com.example.helikopter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HelikoopterList extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlikoopter_list);
        list = findViewById(R.id.list);

        int n = getIntent().getIntExtra("number",0);
        String[] arr = new String[n];
        list.setAdapter(new HelikopterAdapter(this,arr));
    }


}