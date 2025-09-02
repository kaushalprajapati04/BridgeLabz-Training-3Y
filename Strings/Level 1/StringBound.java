import java.util.Scanner;
public class StringBound { 
    public static void generateException(String text) {
        
        System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
    }
    public static void handleException(String text) {
        try {
          
            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of range.");
            System.out.println("Valid range: 0 to " + (text.length() - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("\n--- Generating Exception ---");
        try {
            generateException(input); 
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException() method.");
        }

        System.out.println("\n--- Handling Exception ---");
        handleException(input); 

        sc.close();
    }
}

