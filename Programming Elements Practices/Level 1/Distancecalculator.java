import java.util.Scanner;
public class Distancecalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert to yards and miles
        double distanceInYards = distanceInFeet / 3;       // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760;   // 1 mile = 1760 yards

        // Output
        System.out.printf("The distance of %.2f feet is %.2f yards and %.4f miles.%n",
                distanceInFeet, distanceInYards, distanceInMiles);

        input.close();
    }
}

