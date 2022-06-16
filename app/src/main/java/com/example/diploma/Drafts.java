package com.example.diploma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Drafts extends AppCompatActivity {
    TextView TextView;
    private TextView header, text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        header = findViewById(R.id.textView39);
        text = findViewById(R.id.textView40);

    }



    public void ClickToDraft(View view) {

        Intent intent = new Intent(Drafts.this, Text.class);
        startActivity(intent);

    }
    public void ClickBackFromDrafts(View view) {

        Intent intent = new Intent(Drafts.this, MainActivity.class);
        startActivity(intent);

    }


}