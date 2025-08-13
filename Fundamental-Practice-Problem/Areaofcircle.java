public class Areaofcircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        double area = Math.PI * radius * radius;
        System.out.printf("Area of circle: %.2f%n", area);
    }
}