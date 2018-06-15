package com.gmail.maslyuk.lesya.mentoring.dateobserver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CurrentDateClientImpl implements CurrentDateObserver {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss", Locale.getDefault());
    private Date date;
    private String clientName;

    public CurrentDateClientImpl(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(Date date) {
        this.date = date;
        display();
    }

    public void display() {
        String result = simpleDateFormat.format(date);
        System.out.println("The time is now for " + clientName + " " + result);
    }

}
