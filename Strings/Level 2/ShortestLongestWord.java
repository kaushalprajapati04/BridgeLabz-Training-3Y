import java.util.Scanner;
public class ShortestLongestWord {
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
    public static String[][] wordLengthTable(String[] words) {
        int n = words.length;
        String[][] table = new String[n][2];

        for (int i = 0; i < n; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }
    public static int[] findShortestLongest(String[][] table) {
        int minIndex = 0, maxIndex = 0;
        int minLen = Integer.parseInt(table[0][1]);
        int maxLen = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] table = wordLengthTable(words);
        int[] result = findShortestLongest(table);
        int minIndex = result[0];
        int maxIndex = result[1];
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("----------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%-15s %-10d\n", table[i][0], Integer.parseInt(table[i][1]));
        }
        System.out.println("\nShortest word: " + table[minIndex][0] + " (Length: " + table[minIndex][1] + ")");
        System.out.println("Longest word: " + table[maxIndex][0] + " (Length: " + table[maxIndex][1] + ")");

        sc.close();
    }
}
