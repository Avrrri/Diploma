package com.example.diploma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Message extends AppCompatActivity {

    ImageView ImageView;
    private EditText message;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);
        message = findViewById(R.id.editTextTextMultiLine2);

       ImageView = findViewById(R.id.imageView66);
       ImageView.setVisibility(View.INVISIBLE);

    }


    public void ClickPush(View view) {

        if (message.getText().toString().trim().equals("")) {
            ImageView = findViewById(R.id.imageView66);
            ImageView.setVisibility(View.INVISIBLE);
        }
        else {
            ImageView = findViewById(R.id.imageView66);
            ImageView.setVisibility(View.VISIBLE);
            message.setText("");
        }
    }



    public void ClickBackToMessenger(View view) {
        Intent intent = new Intent(Message.this, Messenger.class);
        startActivity(intent);
    }

}
