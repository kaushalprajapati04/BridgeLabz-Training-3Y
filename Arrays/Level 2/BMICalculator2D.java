import java.util.Scanner;
public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

      
        double[][] personData = new double[n][3]; // [i][0]=weight, [i][1]=height, [i][2]=BMI
        String[] weightStatus = new String[n];

       
        for (int i = 0; i < n; i++) {
            double weight, height;

            while (true) {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("❌ Invalid! Weight must be positive.");
                    continue;
                }
                break;
            }

            while (true) {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Invalid! Height must be positive.");
                    continue;
                }
                break;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
        }

       
        for (int i = 0; i < n; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = weight / (height * height);

            personData[i][2] = bmi; // store BMI

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            }
             else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } 
            else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            }
             else {
                weightStatus[i] = "Obese";
            }
        }

       
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Person", "Weight", "Height", "BMI (Status)");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-15.2f (%s)%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
