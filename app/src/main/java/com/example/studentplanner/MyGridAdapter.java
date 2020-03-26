package com.example.studentplanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import androidx.annotation.NonNull;

public class MyGridAdapter extends ArrayAdapter {
    List<Date> dates;
    Calendar currentDate;
    List<Events> events;
    LayoutInflater inflater;


    public MyGridAdapter(@NonNull Context context,List<Date> dates, Calendar currentDate,  List<Events> events) {
        super(context, R.layout.single_cell_layout);

        this.dates=dates;
        this.currentDate=currentDate;

    }
}
