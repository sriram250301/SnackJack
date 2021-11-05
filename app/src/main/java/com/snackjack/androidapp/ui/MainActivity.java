package com.snackjack.androidapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.snackjack.androidapp.R;
import com.snackjack.androidapp.ui.login.LoginActivity;
import com.snackjack.androidapp.ui.maindashboard.Dashboard;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer;
    //Variables
    Boolean logStatus=false;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CHECK LOGGED IN STATUS
        sharedPreferences=getSharedPreferences("com.snackjack.androidapp.userdetails", Context.MODE_PRIVATE);
        logStatus=sharedPreferences.getBoolean("LOG_STATE",false);

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(!logStatus){
                    Intent intent = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        },3000);


    }
}