import java.util.Scanner;

public class runningLog {
    public static void main(String[] args) {
        int numberOfRun;
        double distance;
        double time;
        System.out.println("How many runs did you go on?");
        Scanner input = new Scanner(System.in);
        numberOfRun = input.nextInt(); //Total number of runs completed (User entry)

        for (int i = 0; i < numberOfRun; ++i) {
            System.out.println("How long was the distance in miles?");
            double distanceInMiles = input.nextDouble(); //Distance ran (User entry)

            System.out.println("What was the time in minutes?");
            double timeInMinutes = input.nextDouble(); //Time spent during run (User entry)

            double averagePace = timeInMinutes / distanceInMiles; //Average calculation per run (Automatic)

            System.out.println("The average pace is " + String.format("%.1f", averagePace)); //String.format("%.1f" is for decimal rounding!

        }
    }
}
