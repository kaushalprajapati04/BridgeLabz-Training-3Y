import java.util.Scanner;
public class CalculateBMI {
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } 
        else if (bmi <= 24.9) {
            status = "Normal";
        } 
        else if (bmi <= 39.9) {
            status = "Overweight";
        } 
        else {
            status = "Obese";
        }
        return new String[]{String.format("%.2f", bmi), status};
    }
    public static String[][] processBMI(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMI(weight, height);

            results[i][0] = String.valueOf(height);      // Height
            results[i][1] = String.valueOf(weight);      // Weight
            results[i][2] = bmiResult[0];                // BMI
            results[i][3] = bmiResult[1];                // Status
        }

        return results;
    }
    public static void displayTable(String[][] results) {
        System.out.printf("%-12s%-12s%-8s%-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");

        for (String[] row : results) {
            System.out.printf("%-12s%-12s%-8s%-15s%n", row[0], row[1], row[2], row[3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];  

        System.out.println("Enter the weight (kg) and height (cm) of 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " Height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        String[][] results = processBMI(data);
        displayTable(results);

        sc.close();
    }
}

