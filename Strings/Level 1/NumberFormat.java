import java.util.Scanner;

public class NumberFormat{

    
    public static void generateException(String text) {
        
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("⚠️ Caught NumberFormatException: The input must be a valid number.");
        } 
        catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        String input = sc.next();

        System.out.println("\n--- Generating Exception ---");
        try {
            generateException(input); 
        } 
        catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException() method.");
        }

        System.out.println("\n--- Handling Exception ---");
        handleException(input); 

        sc.close();
    }
}

