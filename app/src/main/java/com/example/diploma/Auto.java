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


public class Auto extends AppCompatActivity {
    private EditText login, password;
    private DatabaseReference mDataBase;
    private String USER_KEY = "User";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto);
        init();
    }

    //чтобы не захламлять onCreate, а только передать в него
    public void init() {
        login = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextTextPassword);
        mDataBase = FirebaseDatabase.getInstance().getReference(USER_KEY);
    }

    public void ClickMain(View view) {

        if (login.getText().toString().trim().equals("")) {
            //если EditText пуст
            Toast.makeText(getApplicationContext(), "Введите логин!", Toast.LENGTH_SHORT).show();
        }
        else if (password.getText().toString().trim().equals(""))
        {
            Toast.makeText(getApplicationContext(), "Введите пароль!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            // если есть текст, то внести в базу
            String id = mDataBase.getKey();
            String loginName = login.getText().toString();
            String passwordName = password.getText().toString();
            User newUser = new User(id, loginName, passwordName);
            mDataBase.push().setValue(newUser);
            //и перейти на главную страницу
            Intent intent = new Intent(Auto.this, MainActivity.class);
            startActivity(intent);
        }


    }

}
