package com.example.tugas1_10118423;
//7-4-2021-10118423-michaelandreas
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class Splashscreen extends AppCompatActivity {
    private int waktu_loading=4000;
    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke login activity
                Intent Login = new Intent(Splashscreen.this,LoginActivity.class);
                startActivity(Login);
                finish();

            }
        },waktu_loading);
    }
}