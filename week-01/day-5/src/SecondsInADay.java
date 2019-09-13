public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
// seconds a day 86400
// seconds an hour 3600

        int secondsLeftToday = 86400-(currentHours*3600+currentMinutes*60+currentSeconds);
        System.out.println(secondsLeftToday);


        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }
}