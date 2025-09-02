import java.util.Scanner;
public class OnlineShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            double total_price = 0;
            StringBuilder items = new StringBuilder();
            System.out.println("\n--- New Customer ---");
            int n;
            do {
                System.out.print("Enter number of items that you want to add: ");
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("You must add at least 1 product!");
                }
            } 
            while (n <= 0);
            System.out.println("\n--- Product Menu ---");
            System.out.println("1. Book - 400");
            System.out.println("2. chotolate - 20");
            System.out.println("3. Pen - 20");
            System.out.println("4. board - 150");
            System.out.println("5. Cricket bat - 800");
            for (int i = 0; i < n; i++) {
                System.out.print("Enter product number (1-5) for item " + (i + 1) + ": ");
                int choice = sc.nextInt();
                switch (choice) { 
                    case 1:
                        items.append("Book\n");
                        total_price += 400;
                        System.out.println("Added Book - Rs.400");
                        break;
                    case 2:
                        items.append("chotolate\n");
                        total_price += 20;
                        System.out.println("Added chotolate - Rs.20");
                        break;
                    case 3:
                        items.append("Pen\n");
                        total_price += 20;
                        System.out.println("Added Pen - Rs.20");
                        break;
                    case 4:
                        items.append("board\n");
                        total_price += 150;
                        System.out.println("Added board - Rs.150");
                        break;
                    case 5:
                        items.append("Cricket bat\n");
                        total_price += 800;
                        System.out.println("Added Cricket bat - Rs.800");
                        break;
                    default:
                        System.out.println("Invalid choice! Skipped.");
                }
            }
            if (total_price > 1000){
                double discount = total_price * 0.10;
                total_price -= discount;
                System.out.println("\nDiscount: Rs." + discount);
            } 
            System.out.println("\n-- Final Bill --");
            System.out.println(items);
            System.out.println("Total Amount: Rs." + total_price);
            System.out.print("\nNext customer? (y/n): ");
            char ch = sc.next().charAt(0);
            if (ch == 'n' || ch == 'N') {
                System.out.println("Thank you for shopping!");
                break;  
        }
    }    
    sc.close();
    }
}


