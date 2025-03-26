public class PlanetRunner {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 1.0, 12742, 149.6, 9.8, 1, 
                                  false, true, "78% Nitrogen, 21% Oxygen", 
                                  365.25, 24.0, "Natural Formation", false, 
                                  "Terrestrial", "Sun", false, 15.0);

        Planet mars = new Planet("Mars", 0.107, 6779, 227.9, 3.7, 2, 
                                 false, false, "95% Carbon Dioxide, 3% Nitrogen", 
                                 687, 24.6, "Natural Formation", false, 
                                 "Terrestrial", "Sun", false, -60.0);

        Planet saturn = new Planet("Saturn", 95.2, 116460, 1427, 10.4, 83, 
                                   true, false, "96% Hydrogen, 3% Helium", 
                                   10759, 10.7, "Natural Formation", false, 
                                   "Gas Giant", "Sun", false, -178.0);

        System.out.println("Planet 1 Details:");
        System.out.println("Name: " + earth.name);
        System.out.println("Mass: " + earth.mass + " Earth masses");
        System.out.println("Diameter: " + earth.diameter + " km");
        System.out.println("Distance from Sun: " + earth.distanceFromSun + " million km");
        System.out.println("Gravity: " + earth.gravity + " m/s²");
        System.out.println("Number of Moons: " + earth.numberOfMoons);
        System.out.println("Has Rings: " + earth.hasRings);
        System.out.println("Has Life: " + earth.hasLife);
        System.out.println("Atmosphere Composition: " + earth.atmosphereComposition);
        System.out.println("Orbital Period: " + earth.orbitalPeriod + " days");
        System.out.println("Rotation Period: " + earth.rotationPeriod + " hours");
        System.out.println("Discovery Method: " + earth.discoveryMethod);
        System.out.println("Is Dwarf Planet: " + earth.isDwarfPlanet);
        System.out.println("Type: " + earth.type);
        System.out.println("Host Star: " + earth.hostStar);
        System.out.println("Is Exoplanet: " + earth.isExoplanet);
        System.out.println("Surface Temperature: " + earth.surfaceTemperature + " °C");
        System.out.println("===========================================================");

        System.out.println("\nPlanet 2 Details:");
        System.out.println("Name: " + mars.name);
        System.out.println("Mass: " + mars.mass + " Earth masses");
        System.out.println("Diameter: " + mars.diameter + " km");
        System.out.println("Distance from Sun: " + mars.distanceFromSun + " million km");
        System.out.println("Gravity: " + mars.gravity + " m/s²");
        System.out.println("Number of Moons: " + mars.numberOfMoons);
        System.out.println("Has Rings: " + mars.hasRings);
        System.out.println("Has Life: " + mars.hasLife);
        System.out.println("Atmosphere Composition: " + mars.atmosphereComposition);
        System.out.println("Orbital Period: " + mars.orbitalPeriod + " days");
        System.out.println("Rotation Period: " + mars.rotationPeriod + " hours");
        System.out.println("Discovery Method: " + mars.discoveryMethod);
        System.out.println("Is Dwarf Planet: " + mars.isDwarfPlanet);
        System.out.println("Type: " + mars.type);
        System.out.println("Host Star: " + mars.hostStar);
        System.out.println("Is Exoplanet: " + mars.isExoplanet);
        System.out.println("Surface Temperature: " + mars.surfaceTemperature + " °C");
        System.out.println("===========================================================");

        System.out.println("\nPlanet 3 Details:");
        System.out.println("Name: " + saturn.name);
        System.out.println("Mass: " + saturn.mass + " Earth masses");
        System.out.println("Diameter: " + saturn.diameter + " km");
        System.out.println("Distance from Sun: " + saturn.distanceFromSun + " million km");
        System.out.println("Gravity: " + saturn.gravity + " m/s²");
        System.out.println("Number of Moons: " + saturn.numberOfMoons);
        System.out.println("Has Rings: " + saturn.hasRings);
        System.out.println("Has Life: " + saturn.hasLife);
        System.out.println("Atmosphere Composition: " + saturn.atmosphereComposition);
        System.out.println("Orbital Period: " + saturn.orbitalPeriod + " days");
        System.out.println("Rotation Period: " + saturn.rotationPeriod + " hours");
        System.out.println("Discovery Method: " + saturn.discoveryMethod);
        System.out.println("Is Dwarf Planet: " + saturn.isDwarfPlanet);
        System.out.println("Type: " + saturn.type);
        System.out.println("Host Star: " + saturn.hostStar);
        System.out.println("Is Exoplanet: " + saturn.isExoplanet);
        System.out.println("Surface Temperature: " + saturn.surfaceTemperature + " °C");
    }
}
