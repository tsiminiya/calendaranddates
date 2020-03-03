package com.examples.date;

import java.util.Calendar;
import java.util.Date;

public class DateFactory {

    public Date getDate() {
        return new Date();
    }

    public Date getDate(int year, int month, int date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, date);
        return calendar.getTime();
    }

}
