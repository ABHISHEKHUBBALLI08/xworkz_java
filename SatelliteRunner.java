public class SatelliteRunner {
    public static void main(String[] args) {
        Satellite satellite1 = new Satellite("Hubble", "USA", 11110, 569, "Space Telescope", true, 1990, "Space Shuttle Discovery",
                                             "NASA", false, false, false, false, 2800, 30, "Optical", true, false, true, "Astronomy");

        Satellite satellite2 = new Satellite("Cartosat-3", "India", 1625, 509, "Earth Observation", true, 2019, "PSLV-C47",
                                             "ISRO", false, true, false, false, 1500, 7, "X-band", true, false, false, "Mapping");

        Satellite satellite3 = new Satellite("Landsat 8", "USA", 2711, 705, "Earth Monitoring", true, 2013, "Atlas V",
                                             "NASA & USGS", false, true, false, true, 3000, 10, "Infrared", true, false, false, "Remote Sensing");

        System.out.println("Satellite 1 Details:");
        System.out.println("Name: " + satellite1.name);
        System.out.println("Country: " + satellite1.country);
        System.out.println("Weight: " + satellite1.weight + " kg");
        System.out.println("Orbit Height: " + satellite1.orbitHeight + " km");
        System.out.println("Mission Type: " + satellite1.missionType);
        System.out.println("Operational: " + satellite1.isOperational);
        System.out.println("Launch Year: " + satellite1.launchYear);
        System.out.println("Launch Vehicle: " + satellite1.launchVehicle);
        System.out.println("Manufacturer: " + satellite1.manufacturer);
        System.out.println("Geostationary: " + satellite1.isGeostationary);
        System.out.println("Polar Orbit: " + satellite1.isPolarOrbit);
        System.out.println("Spy Satellite: " + satellite1.isSpySatellite);
        System.out.println("Weather Satellite: " + satellite1.isWeatherSatellite);
        System.out.println("Power Capacity: " + satellite1.powerCapacity + " W");
        System.out.println("Lifespan: " + satellite1.lifespan + " years");
        System.out.println("Communication Band: " + satellite1.communicationBand);
        System.out.println("Has Solar Panels: " + satellite1.hasSolarPanels);
        System.out.println("Manned: " + satellite1.isManned);
        System.out.println("AI Control: " + satellite1.hasAIControl);
        System.out.println("Primary Purpose: " + satellite1.primaryPurpose);
        System.out.println("===========================================================");

        System.out.println("\nSatellite 2 Details:");
        System.out.println("Name: " + satellite2.name);
        System.out.println("Country: " + satellite2.country);
        System.out.println("Weight: " + satellite2.weight + " kg");
        System.out.println("Orbit Height: " + satellite2.orbitHeight + " km");
        System.out.println("Mission Type: " + satellite2.missionType);
        System.out.println("Operational: " + satellite2.isOperational);
        System.out.println("Launch Year: " + satellite2.launchYear);
        System.out.println("Launch Vehicle: " + satellite2.launchVehicle);
        System.out.println("Manufacturer: " + satellite2.manufacturer);
        System.out.println("Geostationary: " + satellite2.isGeostationary);
        System.out.println("Polar Orbit: " + satellite2.isPolarOrbit);
        System.out.println("Spy Satellite: " + satellite2.isSpySatellite);
        System.out.println("Weather Satellite: " + satellite2.isWeatherSatellite);
        System.out.println("Power Capacity: " + satellite2.powerCapacity + " W");
        System.out.println("Lifespan: " + satellite2.lifespan + " years");
        System.out.println("Communication Band: " + satellite2.communicationBand);
        System.out.println("Has Solar Panels: " + satellite2.hasSolarPanels);
        System.out.println("Manned: " + satellite2.isManned);
        System.out.println("AI Control: " + satellite2.hasAIControl);
        System.out.println("Primary Purpose: " + satellite2.primaryPurpose);
        System.out.println("===========================================================");

        System.out.println("\nSatellite 3 Details:");
        System.out.println("Name: " + satellite3.name);
        System.out.println("Country: " + satellite3.country);
        System.out.println("Weight: " + satellite3.weight + " kg");
        System.out.println("Orbit Height: " + satellite3.orbitHeight + " km");
        System.out.println("Mission Type: " + satellite3.missionType);
        System.out.println("Operational: " + satellite3.isOperational);
        System.out.println("Launch Year: " + satellite3.launchYear);
        System.out.println("Launch Vehicle: " + satellite3.launchVehicle);
        System.out.println("Manufacturer: " + satellite3.manufacturer);
        System.out.println("Geostationary: " + satellite3.isGeostationary);
        System.out.println("Polar Orbit: " + satellite3.isPolarOrbit);
        System.out.println("Spy Satellite: " + satellite3.isSpySatellite);
        System.out.println("Weather Satellite: " + satellite3.isWeatherSatellite);
        System.out.println("Power Capacity: " + satellite3.powerCapacity + " W");
        System.out.println("Lifespan: " + satellite3.lifespan + " years");
        System.out.println("Communication Band: " + satellite3.communicationBand);
        System.out.println("Has Solar Panels: " + satellite3.hasSolarPanels);
        System.out.println("Manned: " + satellite3.isManned);
        System.out.println("AI Control: " + satellite3.hasAIControl);
        System.out.println("Primary Purpose: " + satellite3.primaryPurpose);
    }
}
