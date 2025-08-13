public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int avg = (num1 + num2 + num3) / 3;
        System.out.printf("Average of %d, %d, and %d is: %d%n", num1, num2, num3, avg)
    }
}