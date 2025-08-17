import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.println("\n--- Using multiple if-else statements ---");
        if (year < 1582) {
            System.out.println("Year is before Gregorian calendar. Leap year check not valid.");
        } 
        else {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } 
            else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year");
            } 
            else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } 
            else {
                System.out.println(year + " is NOT a Leap Year");
            }
        }
        System.out.println("\n--- Using single if with logical operators ---");
        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } 
        else if (year >= 1582) {
            System.out.println(year + " is NOT a Leap Year");
        } 
        else {
            System.out.println("Year is before Gregorian calendar. Leap year check not valid.");
        }

        sc.close();
    }
}
