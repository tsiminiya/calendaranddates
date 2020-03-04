### Setting Date Fields

To set the date fields:

```java
Date date = new Date();
date.setYear(2020);
date.setMonth(0);
date.setDate(20);
date.setHour(1);
date.setMinute(2);
date.setSecond(3);
date.setMillisecond(250);
```

Unfortunately, these methods are also deprecated.

To modify a date:

```java
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);

calendar.set(Calendar.YEAR, 2021);
calendar.set(Calendar.MONTH, 0);
calendar.set(Calendar.DATE, 20);
calendar.set(Calendar.HOUR, 1);
calendar.set(Calendar.MINUTE, 2);
calendar.set(Calendar.SECOND, 3);
calendar.set(Calendar.MILLISECOND, 250);
```

[Previous](date-03-date-fields.md) | [Back to Home](../../README.md) | [Next](date-05-getting-date-out-of-calendar.md)
