package com.example.konuk_v_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Setting extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent i;
        i = new Intent(this, PersonalArea.class);
        startActivity(i);
    }

    public  void  onClickStart(View view) {
        Intent i;
        i = new Intent(this, Login.class);
        startActivity(i);
    }
}