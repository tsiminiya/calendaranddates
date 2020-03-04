### Default Calendar

```java
Calendar calendar = Calendar.getInstance();
```

The instance represents the current time in terms of Epoch.

__Epoch__ is the offset difference of a particular time from January 1, 1970 00:00:00.000 GMT (Gregorian) in milliseconds.

#### Experiment
Try to print to screen the String representation of a Calendar instance:
```java
System.out.println(Calendar.getInstance());
```

You should see something similar:
```text
java.util.GregorianCalendar[time=1583241117002,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Manila",offset=28800000,dstSavings=0,useDaylight=false,transitions=10,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=11,SECOND=57,MILLISECOND=2,ZONE_OFFSET=28800000,DST_OFFSET=0]
```
 
[Previous](calendar-03-other-implementations.md) | [Back to Home](../../README.md) | [Next](calendar-05-datetime-fields.md)
