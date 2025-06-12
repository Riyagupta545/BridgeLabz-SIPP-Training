public class EarthVolumecalculator {
    public static void main(String[] args) {
        double radiusKm = 6378; // Radius in kilometers
        double kmToMiles = 0.621371; // 1 km = 0.621371 miles

        // Volume of a sphere: (4/3) * π * r³
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }

}
