### Date Instantiation

To instantiate a date:

```java
Date date = new Date();
```

The code above will create a Date instance representing the current date and time in Epoch.

#### Zero Date
```java
Date date = new Date(0);
```
will return a Date instance representing January 1, 1970 12:00:00 AM.

#### Setting specific Date
```java
// this constructor is deprecated
Date date = new Date(2020, 2, 4);
```

This is the recommended way
```java
Calendar calendar = Calendar.getInstance();
date = calendar.getTime();
```

[Previous](date-02-instantiation.md) | [Back to Home](../../README.md) | [Next](date-03-date-fields.md)
