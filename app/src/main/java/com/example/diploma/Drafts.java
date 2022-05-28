package com.example.diploma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Drafts extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drafts);
    }

    public void ClickToDraft(View view) {
        Intent intent = new Intent(Drafts.this, Text.class);
        startActivity(intent);

    }
    public void ClickBack(View view) {
        Intent intent = new Intent(Drafts.this, MainActivity.class);
        startActivity(intent);

    }

}