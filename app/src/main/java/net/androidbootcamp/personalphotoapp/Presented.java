package net.androidbootcamp.personalphotoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Presented extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presented);
        //implements a timer before moving to next screen
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(Presented.this, Members.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 4000); //value is in milliseconds

    }
}