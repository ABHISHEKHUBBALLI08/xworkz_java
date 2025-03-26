public class Satellite {
    String name;
    String country;
    double weight;
    double orbitAltitude;
    String launchDate;
    boolean isCommunicationSatellite;
    boolean isNavigationSatellite;
    boolean isEarthObservationSatellite;
    boolean isMilitarySatellite;
    String launchVehicle;
    int lifespan;
    boolean isGeostationary;
    boolean isPolarOrbiting;
    String manufacturer;
    boolean isOperational;
    double powerCapacity;
    String primaryMission;
    double speed;
    boolean isAutonomous;
    boolean hasAIControl;

    public Satellite(String name, String country, double weight, double orbitAltitude, String launchDate,
                     boolean isCommunicationSatellite, boolean isNavigationSatellite, boolean isEarthObservationSatellite,
                     boolean isMilitarySatellite, String launchVehicle, int lifespan, boolean isGeostationary,
                     boolean isPolarOrbiting, String manufacturer, boolean isOperational, double powerCapacity,
                     String primaryMission, double speed, boolean isAutonomous, boolean hasAIControl) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.orbitAltitude = orbitAltitude;
        this.launchDate = launchDate;
        this.isCommunicationSatellite = isCommunicationSatellite;
        this.isNavigationSatellite = isNavigationSatellite;
        this.isEarthObservationSatellite = isEarthObservationSatellite;
        this.isMilitarySatellite = isMilitarySatellite;
        this.launchVehicle = launchVehicle;
        this.lifespan = lifespan;
        this.isGeostationary = isGeostationary;
        this.isPolarOrbiting = isPolarOrbiting;
        this.manufacturer = manufacturer;
        this.isOperational = isOperational;
        this.powerCapacity = powerCapacity;
        this.primaryMission = primaryMission;
        this.speed = speed;
        this.isAutonomous = isAutonomous;
        this.hasAIControl = hasAIControl;
    }
}
