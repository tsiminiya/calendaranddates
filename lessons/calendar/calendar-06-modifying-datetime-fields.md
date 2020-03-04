### Modifying Date and Time Fields

For example, you want to set the date of a Calendar instance to
```text
September 10, 2019 12:00:00 AM
```

You may use the _set()_ method:
```java
calendar.set(Calendar.YEAR, 2019);
calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
calendar.set(Calendar.DATE, 10);
calendar.set(Calendar.HOUR, 0);
calendar.set(Calendar.MINUTE, 0);
calendar.set(Calendar.SECOND, 0);
calendar.set(Calendar.MILLISECOND, 0);
```

#### Calendar Constants
Notice we are using a lot of class variables of Calendar.
Here is the complete list:

| Class Variable | Description |
| --- | --- |
| Calendar.ERA | indicates era e.g. AD or BC |
| Calendar.YEAR |  |
| Calendar.MONTH | zero-based month value e.g. JANUARY = 0 |
| Calendar.WEEK_OF_YEAR | week number in a year e.g. if Calendar instance is set to January 1, then getting WEAK_OF_YEAR will result to 1 as 1st week of the year. |
| Calendar.WEEK_OF_MONTH | week number in a month e.g. if Calendar instance is set to February 1, then getting WEEK_OF_MONTH will result to 1 as 1st week of the month. |
| Calendar.DATE | same as DAY_OF_MONTH |
| Calendar.DAY_OF_MONTH | same as DATE |
| Calendar.DAY_OF_YEAR | day number in a year e.g. February 29, 2020 is the 60th day of the year |
| Calendar.DAY_OF_WEEK_IN_MONTH | day of the week in a month e.g. February 29, 2020 is the 5th Saturday of the month of February |
| Calendar.AM_PM | indicates whether it is AM or PM |
| Calendar.HOUR | 12-hour clock, noon and midnight is represented as 0 e.g. at 10:04:15.250 PM the HOUR is 10 |
| Calendar.HOUR_OF_DAY | 24-hour clock e.g. 10:04:15.250 PM the HOUR_OF_DAY is 22 |
| Calendar.MINUTE | e.g. at 10:04:15.250 PM the MINUTE is 4 |
| Calendar.SECOND | e.g. at 10:04:15.250 PM the SECOND is 15 |
| Calendar.MILLISECOND | e.g. at 10:04:15.250 PM the MILLISECOND is 250 |
| Calendar.ZONE_OFFSET | raw offset from GMT in milliseconds |
| Calendar.DST_OFFSET | daylight savings offset in milliseconds |
| Calendar.FIELD_COUNT | no. of fields recognized by Calendar set and get methods |

[Previous](calendar-05-datetime-fields.md) | [Back to Home](../../README.md) | [Next](calendar-07-other-constants.md)
