import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double height = input.nextDouble();

        double areaInInches = 0.5 * base * height;

        double baseCm = base * 2.54;
        double heightCm = height * 2.54;

        double areaInCm = 0.5 * baseCm * heightCm;

        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters.%n",
                areaInInches, areaInCm);

        input.close();
    }
}

