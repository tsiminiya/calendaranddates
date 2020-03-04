package com.examples.calendar;

import java.util.Calendar;
import java.util.Locale;

public class CalendarDemo {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.toString());

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("DAY_OF_WEEK: " +calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DATE, 29);
        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));

        System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()));

        calendar.roll(Calendar.DATE, true);
        System.out.println("DATE: " + calendar.get(Calendar.DATE));

        calendar.roll(Calendar.DATE, false);
        System.out.println("DATE: " + calendar.get(Calendar.DATE));

        calendar.roll(Calendar.DATE, -1);
        System.out.println("DATE: " + calendar.get(Calendar.DATE));
    }

}
