package com.example.diploma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickSchedule(View view) {
        Intent intent = new Intent(MainActivity.this, Lessons.class);
        startActivity(intent);
    }

    public void ClickLessonCall(View view) {
        Intent intent = new Intent(MainActivity.this, Timing.class);
        startActivity(intent);
    }
    public void ClickMessenger(View view) {
        Intent intent = new Intent(MainActivity.this, Messenger.class);
        startActivity(intent);

    }
    public void ClickDrafts(View view) {
        Intent intent = new Intent(MainActivity.this, Drafts.class);
        startActivity(intent);
    }
    public void ClickSettings(View view) {
        Intent intent = new Intent(MainActivity.this, Settings.class);
        startActivity(intent);
    }


}