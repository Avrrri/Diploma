package com.example.diploma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }

    public void ClickBackToAuto(View view) {
        Intent intent = new Intent(Settings.this, Auto.class);
        startActivity(intent);
    }
    public void ClickBackToMain(View view) {
        Intent intent = new Intent(Settings.this, MainActivity.class);
        startActivity(intent);
    }
}
