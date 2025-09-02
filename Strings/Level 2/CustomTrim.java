import java.util.Scanner;
public class CustomTrim {
    public static int[] findTrimIndices(String str) {
        int start = 0, end = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int i = len - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }
    public static String customSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();
        int[] indices = findTrimIndices(input);
        String customTrimmed = customSubstring(input, indices[0], indices[1]);
        String builtinTrimmed = input.trim();

        boolean isSame = compareStrings(customTrimmed, builtinTrimmed);
        System.out.println("\nOriginal String: [" + input + "]");
        System.out.println("Custom Trimmed: [" + customTrimmed + "]");
        System.out.println("Built-in Trimmed: [" + builtinTrimmed + "]");
        System.out.println("Comparison result: " + isSame);

        sc.close();
    }
}

