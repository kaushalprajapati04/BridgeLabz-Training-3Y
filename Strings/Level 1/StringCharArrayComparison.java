import java.util.Scanner;
public class StringCharArrayComparison {


    public static char[] manualToCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

   
    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String text = sc.next();

       
        char[] manualChars = manualToCharArray(text);
        char[] builtInChars = text.toCharArray();

       
        boolean areEqual = compareCharArrays(manualChars, builtInChars);

       
        System.out.println("\n--- Character Arrays ---");
        System.out.print("Manual method: ");
        printCharArray(manualChars);

        System.out.print("Built-in toCharArray(): ");
        printCharArray(builtInChars);

        System.out.println("\nComparison result: " + areEqual);

        sc.close();
    }
}
