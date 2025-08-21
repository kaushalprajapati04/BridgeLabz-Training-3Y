import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 10;
        double[][] empData = new double[NUM_EMPLOYEES][2]; // [][0] = salary, [][1] = years of service
        double[] bonus = new double[NUM_EMPLOYEES];
        double[] newSalary = new double[NUM_EMPLOYEES];
        double totalOldSalary = 0.0;
        double totalBonus = 0.0;
        double totalNewSalary = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary and years of service for 10 employees:");

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            while (true) {
                try {
                    System.out.print("Employee " + (i + 1) + " Salary: ");
                    double s = sc.nextDouble();
                    System.out.print("Employee " + (i + 1) + " Years of Service: ");
                    double y = sc.nextDouble();

                    if (s <= 0 || y < 0) {
                        System.out.println("❌ Invalid input. Salary must be > 0 and years >= 0. Try again.");
                        continue;
                    }

                    empData[i][0] = s;
                    empData[i][1] = y;
                    break;
                } catch (Exception e) {
                    System.out.println("❌ Invalid number. Please enter again.");
                    sc.nextLine(); // clear input buffer
                }
            }
        }
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double salary = empData[i][0];
            double years = empData[i][1];

            if (years > 5) {
                bonus[i] = 0.05 * salary;
            } else {
                bonus[i] = 0.02 * salary;
            }

            newSalary[i] = salary + bonus[i];

            totalOldSalary += salary;
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), empData[i][0], bonus[i], newSalary[i]);
        }

        System.out.println("\n--- Company Totals ---");
        System.out.printf("Total Old Salary = %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout = %.2f%n", totalBonus);
        System.out.printf("Total New Salary = %.2f%n", totalNewSalary);

        sc.close();
    }
}
