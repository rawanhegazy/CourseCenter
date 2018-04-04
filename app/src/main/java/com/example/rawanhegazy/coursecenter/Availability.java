package com.example.rawanhegazy.coursecenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Availability extends AppCompatActivity {
EditText mdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_availability);
        mdate=findViewById(R.id.date);
        Intent incomingintent =getIntent();
        String date=incomingintent.getStringExtra("date");

        mdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Availability.this,Clender.class);
                startActivity(intent);
            }
        });
        mdate.setText(date);
    }
}
