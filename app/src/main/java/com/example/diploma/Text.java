package com.example.diploma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Text extends AppCompatActivity {
    private EditText textName, text;
    private DatabaseReference mDataBase;
    private String NOTE_KEY = "Note";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);
        initNote();
    }

    public void initNote() {
        textName = findViewById(R.id.editTextTextPersonName2);
        text = findViewById(R.id.editTextTextMultiLine);
        mDataBase = FirebaseDatabase.getInstance().getReference(NOTE_KEY);
    }

    public void ClickToSave(View view) {

        if (textName.getText().toString().trim().equals("")) {
            Toast.makeText(getApplicationContext(), "Напишите название заметки!", Toast.LENGTH_SHORT).show();
        }
        else if (text.getText().toString().trim().equals("")) {
            Toast.makeText(getApplicationContext(), "Напишите что-нибудь в заметку!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Заметка сохранена", Toast.LENGTH_SHORT).show();
            String id = mDataBase.getKey();
            String NameText = textName.getText().toString();
            String textText = text.getText().toString();
            Note newNote = new Note(id, NameText, textText);
            mDataBase.push().setValue(newNote);


        }

    }

    public void ClickBackToDrafts(View view) {
        Intent intent = new Intent(Text.this, Drafts.class);
        startActivity(intent);
    }

}
