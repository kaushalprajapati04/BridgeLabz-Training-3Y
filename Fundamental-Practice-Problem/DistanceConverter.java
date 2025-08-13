public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kilometers = input.nextInt();
        double miles = kilometers * 0.621371;   
        System.out.printf("Distance in miles: %.2f%n", miles);
    }
}