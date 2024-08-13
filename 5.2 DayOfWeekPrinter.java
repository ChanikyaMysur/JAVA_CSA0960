public class DayOfWeekPrinter {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        int dayIndex = 0;
        for (int i = 0; i < 365; i++) {
            System.out.println(daysOfWeek[dayIndex]);
            dayIndex = (dayIndex + 1) % 7; // Cycle through the days of the week
        }
    }
}
