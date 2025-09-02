import java.util.Scanner;
public class CustomSplit {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } 
        catch (StringIndexOutOfBoundsException e) {
            
        }
        return count;
    }
    public static String[] customSplit(String text) {
        int length = findLength(text);

        int wordCount = 1; 
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }      
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1; 
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;     
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                sb.append(text.charAt(j));
            }
            words[i] = sb.toString();
        }
        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] customWords = customSplit(input);
        String[] builtinWords = input.split(" ");
        boolean isSame = compareArrays(customWords, builtinWords);
        System.out.println("\nWords using custom split:");
        for (String word : customWords) {
            System.out.println(word);
        }
        System.out.println("\nWords using built-in split():");
        for (String word : builtinWords) {
            System.out.println(word);
        }

        System.out.println("\nComparison result: " + isSame);

        sc.close();
    }
}

