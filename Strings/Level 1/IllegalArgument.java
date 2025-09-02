import java.util.Scanner;
public class IllegalArgument{

   
    public static void generateException(String text) {
       
        System.out.println("Substring with invalid indices: " + text.substring(5, 2));
    }

   
    public static void handleException(String text) {
        try {
            
            System.out.println("Substring with invalid indices: " + text.substring(5, 2));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("⚠️ Caught IllegalArgumentException: Start index cannot be greater than end index.");
        } 
        catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("\n--- Generating Exception ---");
        try {
            generateException(input); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException() method.");
        }

        System.out.println("\n--- Handling Exception ---");
        handleException(input); 

        sc.close();
    }
}
