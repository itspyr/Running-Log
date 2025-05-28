import java.util.Scanner;

public class runningLog {
    public static void main(String[] args) {
        int numberOfRun;
        double distance;
        double time;
        System.out.println("How many runs did you go on?");
        Scanner input = new Scanner(System.in);
        numberOfRun = input.nextInt();

        for (int i = 0; i < numberOfRun; ++i) {
            System.out.println("How long was the distance in miles?");
            double distanceInMiles = input.nextDouble();
            System.out.println("What was the time in minutes?");
            double timeInMinutes = input.nextDouble();

            double averagePace = timeInMinutes / distanceInMiles;
            System.out.println("The average pace is " + averagePace);


        }
    }
}