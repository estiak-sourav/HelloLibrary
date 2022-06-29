package com.ebs.hellolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ebs.helolibrary.HelloEbs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //HelloEbs.showToast(this, "ok ok ok ");
    }
}