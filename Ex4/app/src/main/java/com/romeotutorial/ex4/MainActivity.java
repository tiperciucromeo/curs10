package com.romeotutorial.ex4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.romeotutorial.ex4.R.id.stop;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button startMusic;
    Button stopMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startMusic = (Button)findViewById(R.id.start);
        stopMusic = (Button)findViewById(stop);

        startMusic.setOnClickListener(this);
        stopMusic.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        if(view == startMusic){
            startService(new Intent(this,MyService.class));
        }else if (view == stopMusic){
            stopService(new Intent(this,MyService.class));
        }

    }
}
