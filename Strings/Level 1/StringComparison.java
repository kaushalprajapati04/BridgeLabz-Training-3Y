import java.util.Scanner;
public class StringComparison {
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

        
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

       
        boolean manualComparison = compareStrings(str1, str2);

       
        boolean builtInComparison = str1.equals(str2);

      
        System.out.println("\n--- String Comparison Results ---");
        System.out.println("Manual comparison using charAt(): " + manualComparison);
        System.out.println("Built-in equals() method: " + builtInComparison);

        
        if (manualComparison == builtInComparison) {
            System.out.println("✅ Both methods give the SAME result.");
        } 
        else {
            System.out.println(" The results are DIFFERENT (check logic).");
        }

        sc.close();
    }
}
