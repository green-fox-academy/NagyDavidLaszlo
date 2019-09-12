public class codingHours {

    public static void main(String[] args) {
        int dailyCoding = 6;
        int weeksSemester = 17;
        int weeklyWorkdays = 5;

        int codingHoursSemester =  weeksSemester * weeklyWorkdays * dailyCoding;
        System.out.println(codingHoursSemester);

        int WorkingHoursAWeek = 52;
        int codingWeekly = dailyCoding * weeklyWorkdays;
        double a = codingWeekly;
        double percentage = a/52*100;

        System.out.println(codingWeekly);
        System.out.println("If weekly working hours is 52 hours then " + percentage + "% of it is spent with coding.");




        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
    }
}
