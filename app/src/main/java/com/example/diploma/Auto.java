package com.example.diploma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class Auto extends AppCompatActivity {
    EditText login, password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto);
    }

    public void ClickMain(View view) {

        login = (EditText)findViewById(R.id.editTextTextPersonName);
        password = (EditText)findViewById(R.id.editTextTextPassword);
        if (login.getText().toString().trim().equals("")) {
            //если EditText пуст
            Toast.makeText(getApplicationContext(), "Введите логин!", Toast.LENGTH_LONG).show();
        }
        else if (password.getText().toString().trim().equals(""))
        {
            Toast.makeText(getApplicationContext(), "Введите пароль!", Toast.LENGTH_LONG).show();
        }
        else
        {
            // если есть текст, то
            Intent intent = new Intent(Auto.this, MainActivity.class);
            startActivity(intent);
        }


    }

}
