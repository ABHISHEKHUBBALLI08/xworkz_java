public class DroneRunner {
    public static void main(String[] args) {
        Drone djiMavic = new Drone("Mavic Air 2", "DJI", 0.57, 68.4, 34, 18.5, true, "4K", "Lithium Polymer",
                                   "Photography", true, true);

        Drone parrotAnafi = new Drone("Anafi", "Parrot", 0.32, 55, 25, 4, false, "4K HDR", "Lithium-ion",
                                      "Recreational", true, false);

        Drone skydio2 = new Drone("Skydio 2", "Skydio", 0.77, 58, 23, 6, true, "4K60 HDR", "Lithium-ion",
                                  "Surveillance", true, true);

        System.out.println("Drone 1 Details:");
        System.out.println("Model: " + djiMavic.model);
        System.out.println("Manufacturer: " + djiMavic.manufacturer);
        System.out.println("Weight: " + djiMavic.weight + " kg");
        System.out.println("Max Speed: " + djiMavic.maxSpeed + " km/h");
        System.out.println("Flight Time: " + djiMavic.flightTime + " minutes");
        System.out.println("Range: " + djiMavic.range + " km");
        System.out.println("Autonomous: " + djiMavic.isAutonomous);
        System.out.println("Camera Quality: " + djiMavic.cameraQuality);
        System.out.println("Battery Type: " + djiMavic.batteryType);
        System.out.println("Purpose: " + djiMavic.purpose);
        System.out.println("GPS Enabled: " + djiMavic.hasGPS);
        System.out.println("Obstacle Avoidance: " + djiMavic.obstacleAvoidance);
        System.out.println("===========================================================");

        System.out.println("\nDrone 2 Details:");
        System.out.println("Model: " + parrotAnafi.model);
        System.out.println("Manufacturer: " + parrotAnafi.manufacturer);
        System.out.println("Weight: " + parrotAnafi.weight + " kg");
        System.out.println("Max Speed: " + parrotAnafi.maxSpeed + " km/h");
        System.out.println("Flight Time: " + parrotAnafi.flightTime + " minutes");
        System.out.println("Range: " + parrotAnafi.range + " km");
        System.out.println("Autonomous: " + parrotAnafi.isAutonomous);
        System.out.println("Camera Quality: " + parrotAnafi.cameraQuality);
        System.out.println("Battery Type: " + parrotAnafi.batteryType);
        System.out.println("Purpose: " + parrotAnafi.purpose);
        System.out.println("GPS Enabled: " + parrotAnafi.hasGPS);
        System.out.println("Obstacle Avoidance: " + parrotAnafi.obstacleAvoidance);
        System.out.println("===========================================================");

        System.out.println("\nDrone 3 Details:");
        System.out.println("Model: " + skydio2.model);
        System.out.println("Manufacturer: " + skydio2.manufacturer);
        System.out.println("Weight: " + skydio2.weight + " kg");
        System.out.println("Max Speed: " + skydio2.maxSpeed + " km/h");
        System.out.println("Flight Time: " + skydio2.flightTime + " minutes");
        System.out.println("Range: " + skydio2.range + " km");
        System.out.println("Autonomous: " + skydio2.isAutonomous);
        System.out.println("Camera Quality: " + skydio2.cameraQuality);
        System.out.println("Battery Type: " + skydio2.batteryType);
        System.out.println("Purpose: " + skydio2.purpose);
        System.out.println("GPS Enabled: " + skydio2.hasGPS);
        System.out.println("Obstacle Avoidance: " + skydio2.obstacleAvoidance);
    }
}
