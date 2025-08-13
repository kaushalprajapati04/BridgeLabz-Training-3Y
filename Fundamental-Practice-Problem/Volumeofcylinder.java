public class Volumeofcylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        int height = input.nextInt();
        int volume = (int)(Math.PI * radius * radius * height);
        System.out.printf("Volume of cylinder: %d%n", volume);
    }
}