import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter the years of service: ");
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for less than or equal to 5 years of service.");
        }

        sc.close();
    }
}

