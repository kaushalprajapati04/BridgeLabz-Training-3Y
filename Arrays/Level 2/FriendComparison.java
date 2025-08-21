import java.util.Scanner;
public class FriendComparison {
    public static void main(String[] args) {
        final int NUM_FRIENDS = 3;
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[NUM_FRIENDS];
        double[] heights = new double[NUM_FRIENDS];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < NUM_FRIENDS; i++) {
            while (true) {
                try {
                    System.out.print("Enter age of " + names[i] + ": ");
                    int age = sc.nextInt();
                    System.out.print("Enter height (in cm) of " + names[i] + ": ");
                    double height = sc.nextDouble();

                    if (age <= 0 || height <= 0) {
                        System.out.println(" Age and height must be positive numbers. Try again.");
                        continue;
                    }

                    ages[i] = age;
                    heights[i] = height;
                    break;
                } catch (Exception e) {
                    System.out.println(" Invalid input. Please enter again.");
                    sc.nextLine(); 
                }
            }
        }
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < NUM_FRIENDS; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}

