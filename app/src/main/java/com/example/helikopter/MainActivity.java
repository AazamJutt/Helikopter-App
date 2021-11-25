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
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.heliNumber);
        findViewById(R.id.heliBtn).setOnClickListener(v -> {
            int n = Integer.parseInt(number.getText().toString());
            Intent intent = new Intent(MainActivity.this,HelikoopterList.class);
            intent.putExtra("number",n);
            startActivity(intent);
        });
    }
}