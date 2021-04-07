package com.example.tugas1_10118423;
//07-04-2021-10118423-michael andreas
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    private EditText ename;
    private EditText eid;
    private EditText epassw;
    private EditText cpass;
    private Button  regist;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,LoginActivity.class);
                Register.this.startActivity(intent);
                Register.this.finish();
            }
        });
    }
}