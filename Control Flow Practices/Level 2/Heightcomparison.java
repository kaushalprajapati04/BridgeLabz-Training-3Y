import java.util.Scanner;
public class Heightcomparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = scanner.nextInt();
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Youngest friend is Amar");
        } 
        else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Youngest friend is Akbar");
        } 
        else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
            System.out.println("Youngest friend is Anthony");
        } 
        else {
            System.out.println("Two or more friends are of the same youngest age.");
        }
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest friend is Amar");
        } 
        else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Tallest friend is Akbar");
        } 
        else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
            System.out.println("Tallest friend is Anthony");
        } 
        else {
            System.out.println("Two or more friends are of the same tallest height.");
        }

        scanner.close();
    }
}

