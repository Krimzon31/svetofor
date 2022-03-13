package com.example.svetofot;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickW(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.WHITE);
    }
    public void onClickB(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.BLACK);
    }
    public void onClickR(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.RED);
    }
}