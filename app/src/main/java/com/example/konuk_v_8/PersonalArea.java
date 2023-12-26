package com.example.konuk_v_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PersonalArea extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personalarea);
        Button btnMaps = findViewById(R.id.button);
    }

    public void onClick(View view) {
        Intent i;
        i = new Intent(this, Login.class);
        startActivity(i);
    }
    public void onClickSetting(View view) {
        Intent i;
        i = new Intent(this, Setting.class);
        startActivity(i);
    }

    public  void onClickMaps(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Googleplex"));
        startActivity(intent);
    }
}