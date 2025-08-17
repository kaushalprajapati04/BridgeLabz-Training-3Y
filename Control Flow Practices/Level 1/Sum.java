import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n >= 1) {
            int sumWhile = 0;
            int counter = 1;
            while (counter <= n) {
                sumWhile += counter;
                counter++;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);
            if (sumWhile == sumFormula) {
                System.out.println("Both computations match.");
            } 
            else {
                System.out.println("Mismatch in computations.");
            }

        } 
        else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        sc.close();
    }
}

