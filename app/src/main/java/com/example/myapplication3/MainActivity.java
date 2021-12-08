package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = findViewById(R.id.button_tyatto);
            //ボタンが押されたとき
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                startActivity(intent);
            }
        });

        final Button button2 = findViewById(R.id.button_post);
        //ボタンが押されたとき
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v2){
                Intent intent = new Intent(MainActivity.this,SubPostActivity.class);
                startActivity(intent);
            }
        });
    }
}