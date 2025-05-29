import java.util.Scanner;

public class runningLog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number of runs: "); //user input
        int numberOfRun = scanner.nextInt();

        double totalDistance = 0.0;
        double totalTime = 0.0;

        for (int i = 0; i < numberOfRun; ++i) { //loop for finding # of miles and time for each run
            System.out.println("Run #" + (i + 1));

            System.out.print("Enter your distance: ");
            double distance = scanner.nextDouble();

            System.out.print("Enter your time: ");
            double time = scanner.nextDouble();

            totalDistance += distance; //updating value
            totalTime += time; //updating value
        }

        if (totalDistance > 0) {
            double averagePace = totalTime / totalDistance;
            System.out.printf("Average Pace: %.2f minutes per mile", averagePace);
        } else {
            System.out.println("Please try again..."); //error msg
        }

        scanner.close();
    }
}