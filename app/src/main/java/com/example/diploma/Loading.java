package com.example.diploma;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

public class Loading extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        Thread thread = new Thread(){
            public  void run() {
                try {
                    TimeUnit.SECONDS.sleep(3);
                    Intent intent = new Intent(Loading.this, Auto.class);
                    startActivity(intent);

                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        thread.start();


    }
}
