import java.util.Scanner;
public class SubStringComparison {
    public static String manualSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSub = manualSubstring(text, start, end);

        
        String builtInSub = text.substring(start, end);

    
        boolean areEqual = compareStrings(manualSub, builtInSub);

       
        System.out.println("\n--- Substring Results ---");
        System.out.println("Manual substring (charAt): " + manualSub);
        System.out.println("Built-in substring(): " + builtInSub);
        System.out.println("Comparison result: " + areEqual);

        sc.close();
    }
}
 