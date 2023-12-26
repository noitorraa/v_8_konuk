package com.example.konuk_v_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PersonalArea extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personalarea);
        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}