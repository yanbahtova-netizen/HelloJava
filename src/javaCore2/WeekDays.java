package javaCore2;

public class WeekDays {
    public static boolean isWeekend(String dayName) {
        if ("Saturday".equals(dayName) || "Sunday".equals(dayName)) {
            return true;
        }
        return false;
    }

    public static int weekendCount(String[] days) {
        int count = 0;
        for (int i = 0; i < days.length; i++) {
            if(isWeekend(days[i])) {
                count++;
            }
        }
        return count;
    }

    public static int weekdayCount(String[] days) {
        int count = 0;
        for (int i = 0; i < days.length; i++) {
            if(!isWeekend(days[i])) {
                count++;
            }
        }
        return count;
    }
}
