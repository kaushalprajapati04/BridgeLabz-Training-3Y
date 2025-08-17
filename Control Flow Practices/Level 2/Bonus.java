import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter your years of service: ");
        int years = scanner.nextInt();
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("You are eligible for a bonus of: " + bonus);
        } 
        else {
            System.out.println("No bonus, as years of service are 5 or less.");
        }

        scanner.close();
    }
}

