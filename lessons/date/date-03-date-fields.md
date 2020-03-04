### Date Fields

Date instance has a number of methods to get and set date fields

```java
Date date = new Date();

// setting year
date.setYear(2021);

// setting month
date.setMonth(0);

// setting date
date.setDate(20);

// setting hour
date.setHour(0);

// setting minute
date.setMinute(10);

// setting seconds
date.setSecond(0);

// setting milliseconds
date.setMillisecond(250);
```

But, these methods are deprecated.

As of version 1.1 of Java, it is recommended to use the Calendar instance to get the fields of a Date object.

```java
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
// then, get fields using calendar.get();
System.out.println(calendar.get(Calendar.DATE)); // to print the date
```

[Previous](date-02-instantiation.md) | [Back to Home](../../README.md) | [Next](date-04-setting-date-fields.md)

