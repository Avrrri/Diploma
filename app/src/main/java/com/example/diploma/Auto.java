package com.example.diploma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class Auto extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto);

        //да что бл не так
        /*
        if (findViewById(R.id.editTextTextPersonName.getText().toString().equals(""))) {
            // Здесь код, если EditText пуст
            Toast.makeText(this, "Введите логин!", Toast.LENGTH_LONG);
        }
        else
        {
        // если есть текст, то здесь другой код
            return;
        }
        */





/*

        EditText login, password;
        boolean isNullOrEmmpty;
        String str;

        login = (EditText)findViewById(R.id.editTextTextPersonName);
        password = (EditText)findViewById(R.id.editTextTextPassword);
        if (isNullOrEmpty(login) || isNullOrEmpty(password)){
            Toast.makeText(this, "Введите логин и пароль!", Toast.LENGTH_LONG);
        }
*/


/*
        private boolean vallidation() {
            if(login.getText().toString().trim().equals("")) {
                Toast.makeText(this, "Введите логин!", Toast.LENGTH_LONG);
                return false;
            } else if (login.getText().toString().trim().equals("")) {
                Toast.makeText(this, "Введите пароль!", Toast.LENGTH_LONG);
                return false;
            }
            return true;
        }

*/


    }
/*
    private boolean isNullOrEmmpty(String str){
        return str == null || str.trim().lenght() == 0;
    }
*/
    public void ClickMain(View view) {
        Intent intent = new Intent(Auto.this, MainActivity.class);
        startActivity(intent);
    }

}
