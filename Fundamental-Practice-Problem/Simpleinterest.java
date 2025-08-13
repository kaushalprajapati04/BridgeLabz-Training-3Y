public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        principal = input.nextInt();
        rate = input.nextInt();
        time = input.nextInt();
        double simpleInterest = (principal * rate * time) / 100.0;
        System.out.printf("Simple Interest: %.2f%n", simpleInterest);
    }
}