package syllabus;

public class Question29 {
    enum Days{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        Days day = Days.SUNDAY;
        System.out.println("today is: "+ day);
        for(Days days: Days.values()){
            System.out.println(days);
        }
    }
}
