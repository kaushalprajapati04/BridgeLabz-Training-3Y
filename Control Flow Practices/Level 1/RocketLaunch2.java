import java.util.Scanner;
public class RocketLaunch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting countdown number: ");
        int start = sc.nextInt();
        for (int counter = start; counter >= 1; counter--) {
            System.out.println(counter);
        }
        System.out.println("Rocket Launched");
        sc.close();
    }
}

