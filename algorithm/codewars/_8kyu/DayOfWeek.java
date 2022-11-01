package codewars._8kyu;

public class DayOfWeek {
    public static String getDay(int day) {
        switch (day) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Wrong, please enter a number between 1 and 7";
        }
    }
}

/*
* https://www.codewars.com/kata/59dd3ccdded72fc78b000b25/train/java
* */