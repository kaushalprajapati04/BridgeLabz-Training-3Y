import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

       
        String numStr = String.valueOf(num);
        int length = numStr.length();
        int[] digits = new int[length];

        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

       
        int[] frequency = new int[10];

     
        for (int d : digits) {
            frequency[d]++;
        }

        System.out.println("\nDigit Frequency in " + num + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " => " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}

