public class Heightconvertor {
    public static void main(String[] args) {
        double heightCm = 170; 
        double cmPerInch = 2.54;
        double inchesPerFoot = 12;

        double totalInches = heightCm / cmPerInch;
        int feet = (int) (totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, inches);
    }
}
