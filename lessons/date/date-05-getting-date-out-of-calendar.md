### Getting Date object from Calendar instance

```java
Calendar calendar = Calendar.getInstance();
calendar.set(Calendar.YEAR, 2021);
calendar.set(Calendar.MONTH, 0);
calendar.set(Calendar.DATE, 20);
calendar.set(Calendar.HOUR_OF_DAY, 13);
calendar.set(Calendar.MINUTE, 45);
calendar.set(Calendar.SECOND, 20);
calendar.set(Calendar.MILLISECOND, 300);

// getTime() method returns a Date object
Date date = calendar.getTime();
```

[Previous](date-04-setting-date-fields.md) | [Back to Home](../../README.md)
