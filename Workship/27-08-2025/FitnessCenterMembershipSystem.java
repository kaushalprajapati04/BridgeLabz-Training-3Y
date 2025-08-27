import java.util.Scanner;
public class FitnessCenterMembershipSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double MONTHLY_FEE = 1000;
        final double QUARTERLY_FEE = 2700; 
        final double YEARLY_FEE = 10000;   
        boolean keepRunning = true;
        do {
            System.out.print("Enter number of members to register: ");
            int numMembers = sc.nextInt();
            for (int i = 1; i <= numMembers; i++) {
                System.out.println("\n--- Registering Member " + i + " ---");
                System.out.println("Select Membership Type:");
                System.out.println("1. Monthly");
                System.out.println("2. Quarterly");
                System.out.println("3. Yearly");
                int choice = sc.nextInt();
                double fee = 0;
                switch (choice) {
                    case 1:
                        fee = MONTHLY_FEE;
                        break;
                    case 2:
                        fee = QUARTERLY_FEE;
                        break;
                    case 3:
                        fee = YEARLY_FEE;
                        break;
                    default:
                        System.out.println("Invalid choice. Defaulting to Monthly.");
                        fee = MONTHLY_FEE;
                }
                System.out.print("Is the member a Student or Senior Citizen? (yes/no): ");
                String discountInput = sc.next();
                if (discountInput.equalsIgnoreCase("yes")) {
                    fee = fee * 0.8; 
                    System.out.println("Discount applied (20%).");
                }
                System.out.println("Final Membership Fee for Member " + i + ": Rs. " + fee);
            }
            System.out.print("\nDo you want to register more members? (yes/no): ");
            String more = sc.next();
            if (more.equalsIgnoreCase("no")) {
                keepRunning = false;
            }

        } 
        while (keepRunning); 

        System.out.println("\nFitness Center closed. Thank you!");
        sc.close();
    }
}

