### Rolling Calendar Fields

Let's say it's March 4 today.

When we execute the following code:

```java
calendar.roll(Calendar.DATE, true);
```

The date in calendar instance becomes March 5.

Executing the next code:

```java
calendar.roll(Calendar.DATE, true);
```

will roll back the date to March 4.

Try to execute the following code:

```java
calendar.roll(Calendar.DATE, 2);
```

will roll forward the date to March 6.

Finally, execute the following code:

```java
calendar.roll(Calendar.DATE, -3);
```

will roll back the date to March 3.

#### Simple Exercise

Try rolling the other fields: HOUR, MINUTE, SECOND, MILLISECOND, MONTH and YEAR.

[Previous](calendar-09-display-names.md) | [Back to Home](../../README.md)
