### Displaying Names of Days and Months

For display purposes, Calendar instance has a method for generating display names for
1. month
2. day of the week
3. AM or PM

For example, to display the day of the week of a Calendar instance:
```java
System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()));
```

Try the following code:

Short day name 
```java
System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault()));
```

Month name
```java
System.out.println(calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
```

Short month name
```java
System.out.println(calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault()));
```

AM/PM
```java
System.out.println(calendar.getDisplayName(Calendar.AM_PM, Calendar.LONG, Locale.getDefault()));
```

[Previous](calendar-08-overloaded-set-method.md) | [Back to Home](../../README.md) | [Next](calendar-10-rolling-of-fields.md)
