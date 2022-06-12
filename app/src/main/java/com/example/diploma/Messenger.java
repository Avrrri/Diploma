package com.example.diploma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Messenger extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messenger);
    }

    public void ClickBackFromMessenger(View view) {
        Intent intent = new Intent(Messenger.this, MainActivity.class);
        startActivity(intent);
    }
}