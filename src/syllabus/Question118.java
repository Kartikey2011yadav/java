package syllabus;

import java.util.*;
public class Question118 {
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();

        System.out.println("The Current Date and Time is:" + calendar.getTime());
        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("Maximum number of days in a week: " + calendar.getMaximum(Calendar.DAY_OF_WEEK));
        System.out.println("Minimum number of weeks in a year: " + calendar.getMinimum(Calendar.WEEK_OF_YEAR));
        System.out.println("Maximum number of weeks in a year: " + calendar.getMaximum(Calendar.WEEK_OF_YEAR));
        calendar.add(Calendar.WEEK_OF_YEAR, -2);
        System.out.println("2 weeks earlier: " + calendar.getTime());
        calendar.add(Calendar.WEEK_OF_YEAR, 2);
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 years later: " + calendar.getTime());
    }
}

