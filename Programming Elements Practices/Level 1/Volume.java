public class Volume {
    public static void main(String[] args) {
        double radius = 6378; 
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double radiusMiles = radius * 0.621371; 
        double volumeMi3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f%n", volumeKm3, volumeMi3);
    }
}
