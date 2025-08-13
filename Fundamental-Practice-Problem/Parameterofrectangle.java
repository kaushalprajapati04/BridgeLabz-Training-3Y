public class ParameterOfRectangle {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int length = input.nextInt(
        int width = input.nextInt();
        int perimeter = 2 * (length + width);
         System.out.printf("Perimeter of rectangle: %d%n", perimeter);
     }
}