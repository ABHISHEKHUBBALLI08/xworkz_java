public class Planet {
    String name;
    double mass; // in Earth masses
    double diameter; // in kilometers
    double distanceFromSun; // in million kilometers
    double gravity; // in m/s²
    int numberOfMoons;
    boolean hasRings;
    boolean hasLife;
    String atmosphereComposition;
    double orbitalPeriod; // in Earth days
    double rotationPeriod; // in hours
    String discoveryMethod;
    boolean isDwarfPlanet;
    String type; // Terrestrial, Gas Giant, Ice Giant, etc.
    String hostStar;
    boolean isExoplanet;
    double surfaceTemperature; // in Celsius

    public Planet(String name, double mass, double diameter, double distanceFromSun, double gravity, int numberOfMoons,
                  boolean hasRings, boolean hasLife, String atmosphereComposition, double orbitalPeriod, double rotationPeriod,
                  String discoveryMethod, boolean isDwarfPlanet, String type, String hostStar, boolean isExoplanet,
                  double surfaceTemperature) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.distanceFromSun = distanceFromSun;
        this.gravity = gravity;
        this.numberOfMoons = numberOfMoons;
        this.hasRings = hasRings;
        this.hasLife = hasLife;
        this.atmosphereComposition = atmosphereComposition;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
        this.discoveryMethod = discoveryMethod;
        this.isDwarfPlanet = isDwarfPlanet;
        this.type = type;
        this.hostStar = hostStar;
        this.isExoplanet = isExoplanet;
        this.surfaceTemperature = surfaceTemperature;
    }
}
