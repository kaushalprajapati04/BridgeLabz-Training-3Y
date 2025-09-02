import java.util.Scanner;
public class CinemaHall {
    public static void main(String[] args) {
        int rows = 5, cols = 10;
        int[][] seats = new int[rows][cols]; 
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n 1. Book seats for family of 3");
            System.out.println("2. Show seating arrangement");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) { 
                case 1:
                    boolean booked = false;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j <= cols - 3; j++) {
                            if (seats[i][j] == 0 && seats[i][j + 1] == 0 && seats[i][j + 2] == 0) {
                                seats[i][j] = seats[i][j + 1] = seats[i][j + 2] = 1;
                                System.out.println("Booked 3 seats in Row " + (i + 1) +
                                        " at seats " + (j + 1) + "-" + (j + 3));
                                booked = true;
                                break; 
                            }
                        }
                        if (booked) break;
                    }
                    if (!booked) {
                        System.out.println("Not available!");
                    }
                    break;
                case 2:
                    System.out.println("Seating arrangement (0=Free, 1=Booked):");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print(seats[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}