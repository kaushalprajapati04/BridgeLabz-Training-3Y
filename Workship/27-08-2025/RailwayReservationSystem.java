import java.util.Scanner;
public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seats = 5;
        int booked = 0;
        int waitingList = 2;

        System.out.println("=== Welcome to Railway Reservation System ===");
        System.out.println("Choose your Train: ");
        System.out.println("1. Express Train (Fare: 500)");
        System.out.println("2. Superfast Train (Fare: 800)");
        System.out.println("3. Luxury Train (Fare: 1200)");

        int choice = sc.nextInt();
        int fare = 0;
        switch (choice) {
            case 1:
                fare = 500;
                System.out.println("You chose Express Train. Fare: " + fare);
                break;
            case 2:
                fare = 800;
                System.out.println("You chose Superfast Train. Fare: " + fare);
                break;
            case 3:
                fare = 1200;
                System.out.println("You chose Luxury Train. Fare: " + fare);
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Express Train (Fare 500).");
                fare = 500;
        }
        do {
            System.out.print("\nHow many passengers want to book? ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (booked < seats) {
                    booked++;
                    System.out.println("Passenger " + i + " booking confirmed! Seat No: " + booked);
                } 
                else if (waitingList > 0) {
                    waitingList--;
                    System.out.println("Passenger " + i + " is in WAITING LIST.");
                } 
                else {
                    System.out.println("Passenger " + i + " cannot be booked. Train FULL!");
                }
            }

            System.out.println("\nTotal Seats Booked: " + booked);
            System.out.println("Seats Left: " + (seats - booked));
            System.out.println("Waiting List Left: " + waitingList);

            if (booked >= seats && waitingList == 0) {
                System.out.println("\nAll seats and waiting list full. Booking closed!");
                break;
            }

            System.out.print("\nDo you want to continue booking? (yes=1 / no=0): ");
        } 
        while (sc.nextInt() == 1);

        System.out.println("\nThank you for using Railway Reservation System!");
        sc.close();
    }
}
