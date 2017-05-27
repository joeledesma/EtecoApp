package com.android.joeledesma.etecoapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button linearLayoutVerticalButton = (Button) findViewById(R.id.BotonirActivity);
        linearLayoutVerticalButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, NuevoActivity.class);
                startActivity(intent);
            }
            }
        );
        Button linearLayoutButton = (Button) findViewById(R.id.button_otro);
        linearLayoutVerticalButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, TableActivity.class);
                startActivity(intent);
            }
                                                      }
        );
        Button BotonIrFrame = (Button) findViewById(R.id.BotonirFrame);
        BotonIrFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrameLay.class);
                startActivity(intent);
            }
        });
    }
}



