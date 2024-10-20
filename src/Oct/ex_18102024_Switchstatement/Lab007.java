package Oct.ex_18102024_Switchstatement;

import java.time.DayOfWeek;

public class Lab007 {
    public static void main(String[] args) {
        int day = 8;
        String dayName = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Data";
};
System.out.println(dayName);
}
}