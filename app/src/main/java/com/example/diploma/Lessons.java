package com.example.diploma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Lessons extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessons);
    }

    public void ClickBackFromLessons(View view) {
        Intent intent = new Intent(Lessons.this, MainActivity.class);
        startActivity(intent);

    }
}
