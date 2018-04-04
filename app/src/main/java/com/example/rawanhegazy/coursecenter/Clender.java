package com.example.rawanhegazy.coursecenter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;

public class Clender extends AppCompatActivity {
CalendarView mcalender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clender);
        mcalender=findViewById(R.id.calendarView);
        mcalender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date=dayOfMonth+"/"+month+"/"+year;
                Intent intent=new Intent(Clender.this,Availability.class);
                intent.putExtra("date",date);
                startActivity(intent);
            }
        });
    }
}
