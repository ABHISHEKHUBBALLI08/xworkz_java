public class RocketRunner {
    public static void main(String[] args) {
        Rocket falcon9 = new Rocket("Falcon 9", "SpaceX", 70, 549, 22.8, 7607, 
                                    27000, 2, true, "RP-1/LOX", "Kennedy Space Center", 
                                    "Satellite & Human Spaceflight", 200, true);

        Rocket saturnV = new Rocket("Saturn V", "NASA", 110.6, 2900, 140, 35000, 
                                    40000, 3, false, "RP-1/LOX + LH2/LOX", "Kennedy Space Center", 
                                    "Moon Missions", 13, false);

        Rocket gslvMk3 = new Rocket("GSLV Mk III", "ISRO", 43.5, 640, 8, 16000, 
                                    10000, 3, false, "Solid + Liquid + Cryogenic", "Satish Dhawan Space Centre", 
                                    "Satellite & Human Spaceflight", 10, true);

        System.out.println("Rocket 1 Details:");
        System.out.println("Name: " + falcon9.name);
        System.out.println("Manufacturer: " + falcon9.manufacturer);
        System.out.println("Height: " + falcon9.height + " meters");
        System.out.println("Weight: " + falcon9.weight + " tons");
        System.out.println("Payload Capacity: " + falcon9.payloadCapacity + " tons");
        System.out.println("Thrust: " + falcon9.thrust + " kN");
        System.out.println("Speed: " + falcon9.speed + " km/h");
        System.out.println("Stages: " + falcon9.stages);
        System.out.println("Reusable: " + falcon9.isReusable);
        System.out.println("Fuel Type: " + falcon9.fuelType);
        System.out.println("Launch Site: " + falcon9.launchSite);
        System.out.println("Mission Type: " + falcon9.missionType);
        System.out.println("Successful Launches: " + falcon9.successfulLaunches);
        System.out.println("Active: " + falcon9.isActive);
        System.out.println("===========================================================");

        System.out.println("\nRocket 2 Details:");
        System.out.println("Name: " + saturnV.name);
        System.out.println("Manufacturer: " + saturnV.manufacturer);
        System.out.println("Height: " + saturnV.height + " meters");
        System.out.println("Weight: " + saturnV.weight + " tons");
        System.out.println("Payload Capacity: " + saturnV.payloadCapacity + " tons");
        System.out.println("Thrust: " + saturnV.thrust + " kN");
        System.out.println("Speed: " + saturnV.speed + " km/h");
        System.out.println("Stages: " + saturnV.stages);
        System.out.println("Reusable: " + saturnV.isReusable);
        System.out.println("Fuel Type: " + saturnV.fuelType);
        System.out.println("Launch Site: " + saturnV.launchSite);
        System.out.println("Mission Type: " + saturnV.missionType);
        System.out.println("Successful Launches: " + saturnV.successfulLaunches);
        System.out.println("Active: " + saturnV.isActive);
        System.out.println("===========================================================");

        System.out.println("\nRocket 3 Details:");
        System.out.println("Name: " + gslvMk3.name);
        System.out.println("Manufacturer: " + gslvMk3.manufacturer);
        System.out.println("Height: " + gslvMk3.height + " meters");
        System.out.println("Weight: " + gslvMk3.weight + " tons");
        System.out.println("Payload Capacity: " + gslvMk3.payloadCapacity + " tons");
        System.out.println("Thrust: " + gslvMk3.thrust + " kN");
        System.out.println("Speed: " + gslvMk3.speed + " km/h");
        System.out.println("Stages: " + gslvMk3.stages);
        System.out.println("Reusable: " + gslvMk3.isReusable);
        System.out.println("Fuel Type: " + gslvMk3.fuelType);
        System.out.println("Launch Site: " + gslvMk3.launchSite);
        System.out.println("Mission Type: " + gslvMk3.missionType);
        System.out.println("Successful Launches: " + gslvMk3.successfulLaunches);
        System.out.println("Active: " + gslvMk3.isActive);
    }
}
