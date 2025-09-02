import java.util.*;

public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seats:");
        int n = sc.nextInt();
        int seats[] = new int[n];
        for (int i = 0; i < n; i++) {
            seats[i] = 0; // 0 indicates seat is available
        }
        while (true) {
            System.out.println("Enter 1 to book a seat, 2 to cancel a booking, 3 to view seat status, 4 to exit:");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter seat number to book (0 to " + (n - 1) + "):");
                int seatNumber = sc.nextInt();
                if (seatNumber >= 0 && seatNumber < n) {
                    if (seats[seatNumber] == 0) {
                        seats[seatNumber] = 1; // 1 indicates seat is booked
                        System.out.println("Seat " + seatNumber + " booked successfully.");
                    } else {
                        System.out.println("Seat " + seatNumber + " is already booked.");
                    }
                } else {
                    System.out.println("Invalid seat number.");
                }
            } else if (choice == 2) {
                System.out.println("Enter seat number to cancel booking (0 to " + (n - 1) + "):");
                int seatNumber = sc.nextInt();
                if (seatNumber >= 0 && seatNumber < n) {
                    if (seats[seatNumber] == 1) {
                        seats[seatNumber] = 0; // Cancel booking
                        System.out.println("Booking for seat " + seatNumber + " cancelled successfully.");
                    } else {
                        System.out.println("Seat " + seatNumber + " is not booked.");
                    }
                } else {
                    System.out.println("Invalid seat number.");
                }
            } else if (choice == 3) {
                System.out.println("Seat status:");
                for (int i = 0; i < n; i++) {
                    String status = seats[i] == 0 ? "Available" : "Booked";
                    System.out.println("Seat " + i + ": " + status);
                }
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}