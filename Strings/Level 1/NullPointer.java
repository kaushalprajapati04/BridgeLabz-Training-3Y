public class NullPointer {

    public static void generateException() {
        String text = null; 

       
        System.out.println("Length of string: " + text.length());
    }

    
    public static void handleException() {
        String text = null; 

        try {
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("⚠️ Caught NullPointerException: Cannot call methods on a null object.");
        }
    }

    // Method to find length without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception thrown when index is out of bounds
        }
        return count;
    }

    public static void main(String[] args) {
        // Exception demo
        System.out.println("--- Generating Exception ---");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException() method.");
        }

        System.out.println("\n--- Handling Exception ---");
        handleException();

        // String length demo
        System.out.println("\n--- String Length Demo ---");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = getStringLength(input);
        int builtInLength = input.length();

        System.out.println("Length (custom method): " + customLength);
        System.out.println("Length (built-in method): " + builtInLength);
    }
}

