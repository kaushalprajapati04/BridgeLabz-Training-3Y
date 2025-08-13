public class Exponent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int exponent = input.nextInt();
        int result = 1;
        result = (int) Math.pow(base, exponent);
        System.out.printf("Result of %d raised to the power of %d is: %d%n", base, exponent, result);
    }
}