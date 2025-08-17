import java.util.Scanner;
public class Powerwhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number (positive integer): ");
        int number = scanner.nextInt();
        System.out.print("Enter the power (positive integer): ");
        int power = scanner.nextInt();
        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
        } 
        else {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result = result * number;
                counter++;
            }

            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }

        scanner.close();
    }
}
